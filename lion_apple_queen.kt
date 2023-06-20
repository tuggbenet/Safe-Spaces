// Set up some safety nets
val safeSpacesList = mutableListOf<String>()

// Create a function for adding spaces to the list
fun addSafeSpace(space: String) {
    safeSpacesList.add(space)
}

// Create a function for removing spaces from the list
fun removeSafeSpace(space: String) {
    safeSpacesList.remove(space)
}

// Create a function for printing out the list of safe spaces
fun displaySafeSpaces() {
    println("Safe Spaces:")
    safeSpacesList.forEach { println(it) }
}

// Create a function for searching the list of safe spaces
fun searchSafeSpace(space: String): Boolean {
    return safeSpacesList.contains(space)
}

// Create a function for saving the list of safe spaces to a file
fun saveSafeSpaces(fileName: String) {
    val writer = FileWriter(fileName)
    safeSpacesList.forEach { writer.write("$it\n") }
    writer.close()
}

// Create a function for loading a list of safe spaces from a file
fun loadSafeSpaces(fileName: String) {
    val reader = FileReader(fileName)
    val safeSpaceList = mutableListOf<String>()
    reader.forEachLine { safeSpaceList.add(it) }
    safeSpacesList.addAll(safeSpaceList)
    reader.close()
}

// Create a function for checking if a space is safe
fun isSpaceSafe(space: String): Boolean {
    return safeSpacesList.contains(space)
}

// Create a function for adding members to a safe space
fun addMemberToSafeSpace(space: String, member: String) {
    if (isSpaceSafe(space)) {
        val membersList = mutableListOf<String>()
        if (safeSpacesList.containsKey(space)) {
            membersList.addAll(safeSpacesList[space]!!)
        }
        membersList.add(member)
        safeSpacesList[space] = membersList
    }
}

// Create a function for removing members from a safe space
fun removeMemberFromSafeSpace(space: String, member: String) {
    if (isSpaceSafe(space)) {
        val membersList = mutableListOf<String>()
        if (safeSpacesList.containsKey(space)) {
            membersList.addAll(safeSpacesList[space]!!)
        }
        membersList.remove(member)
        safeSpacesList[space] = membersList
    }
}

// Create a function for displaying the members of a safe space
fun displaySafeSpaceMembers(space: String) {
    if (isSpaceSafe(space)) {
        val membersList = mutableListOf<String>()
        if (safeSpacesList.containsKey(space)) {
            membersList.addAll(safeSpacesList[space]!!)
        }
        println("Members of $space:")
        membersList.forEach { println(it) }
    }
}