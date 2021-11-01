// Brendan G.


import java.util.Scanner;

public class FactorWindChill {
	
	public static void main(String[] args) {
	
	
		// Creates a scanner object
		Scanner input = new Scanner(System.in);


		// Displays Calculator name
		System.out.println("-WIND CHILL CALCULATOR-");


		// Prompts user to enter a temperature
		System.out.print("Enter a temperature between -58\u00b0F & 41\u00b0F: ");
		double temperature = input.nextDouble();


		// Prompts user to enter a wind speed
		System.out.print("Enter a wind speed equal to" + " or greater than " + "2: ");
		double wind = input.nextDouble();
		wind = Math.pow(wind, 0.16);


		// Calculates user input with wind chill formula
		double windchillfactor = (35.74) + (0.6215 * temperature) - (35.75 * 
		wind) + (0.4275 * temperature * wind);


		// Displays the wind chill factor with a note for the user
		System.out.println("The Wind chill factor is: " + Math.floor(windchillfactor) + "\u00b0F"); 
		
		System.out.println("(*This is what the wind feels like to your body*)");
	}
}