// Imports
import scala.collection.mutable.ListBuffer

// Data Type
case class SafeSpace (country: String, city: String, location: String, latitude: Double, longitude: Double )

// Main Body
object SafeSpaces {
  
  // Global Variables
  val List_SafeSpaces = ListBuffer.empty[SafeSpace]

  //Helper Function
  def addSafeSpace(country: String, city: String, location: String, latitude: Double, longitude: Double): Unit = {
    List_SafeSpaces += SafeSpace(country, city, location, latitude, longitude)
  }
  
  //Main Functions
  def viewSafeSpaces() : ListBuffer[SafeSpace] = {
    return List_SafeSpaces
  }
  
  def searchSafeSpace(country: String, city: String): ListBuffer[SafeSpace] = {
    var result = ListBuffer.empty[SafeSpace]
    for (i <- List_SafeSpaces) {
      if (i.country == country && i.city == city)
        result += i
    }
    return result
  }

  def removeSafeSpace(country: String, city: String, location: String): Boolean = {
    var result = false
    for (i <- List_SafeSpaces) {
      if (i.country == country && i.city == city && i.location == location) {
        List_SafeSpaces -= i
        result = true
      }
    }
    return result
  }
  
  def updateSafeSpace(country: String, city: String, location: String, latitude: Double, longitude: Double): Boolean = {
    var result = false
    for (i <- List_SafeSpaces) {
      if (i.country == country && i.city == city && i.location == location) {
        removeSafeSpace(country, city, location)
        addSafeSpace(country, city, location, latitude, longitude)
        result = true
      }
    }
    return result
  }
}