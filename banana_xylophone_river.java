import java.util.*; 

public class SafeSpaces {

	public static void main(String[] args) {
		
		int numSafeSpaces = 0;
		String[] safeSpaces = new String[50];
		  
		// Add safe spaces to array
		safeSpaces[0] = "Library";
		safeSpaces[1] = "Yoga Studio";
		safeSpaces[2] = "Community Center";
		safeSpaces[3] = "Counseling Office";
		safeSpaces[4] = "LGBTQ Center";
		safeSpaces[5] = "Mental Health Clinic";
		safeSpaces[6] = "Church";
		safeSpaces[7] = "Women's Center";
		safeSpaces[8] = "Veterans Center";
		safeSpaces[9] = "Crisis Hotline";
		
		// Loop through array to find number of safe spaces
		for(int i=0; i<safeSpaces.length; i++) {
		
			if(safeSpaces[i] != null) {
				numSafeSpaces++;
			}
		}
		
		System.out.println("There are currently " + numSafeSpaces + " safe spaces in our community.");
		
		// Print out all safe spaces
		for(int i=0; i<safeSpaces.length; i++) {
			
			if(safeSpaces[i] != null) {
				System.out.println("Safe Space #" + (i+1) + ": " + safeSpaces[i]);
			}
		}
		
		// Ask user for their zip code
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your zip code: ");
		int zipCode = input.nextInt();
		
		// Loop through array to compare zip codes
		String matchingLocation = "";
		for(int i=0; i<safeSpaces.length; i++) {
			
			// Ask user for safe space location
			if(safeSpaces[i] != null) {
				System.out.print("Please enter the zip code for " + safeSpaces[i] + ": ");
				int safeSpaceZipCode = input.nextInt();
				
				// Compare user's zip code with safe space location zip codes
				if(zipCode == safeSpaceZipCode) {
					matchingLocation = safeSpaces[i];
					break;
				}
			}
		}
		
		// Print out message to user
		if(matchingLocation == "") {
			System.out.println("Sorry, there are no safe spaces near you at this time.");
		} else {
			System.out.println("The closest safe space to you is " + matchingLocation + "!");
		}
	}
	
}