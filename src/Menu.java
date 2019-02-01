
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) throws FileNotFoundException {

		String userInput = "";
		String filename="";

		Scanner scanner = new Scanner(System.in);

		System.out.println("Pleased to meet you. Welcome to Text Analysis System...");

		// this variable is used to control whether the loop will continue to ask
		// the user for input - it is set to true here and only becomes false if the
		// user wishes to exit the programme

		boolean UsersChoice = true;
		// main while loop - presents user with options and then performs tasks based on
		// the selected options
		while (UsersChoice) {
			// present user with options
			System.out.println("What would you like to do? Please select a number: ");
			System.out.println(" a. Analyse text via keyboard");
			System.out.println(" b. Analyse text from a file");
			System.out.println(" c. Watch a demo");
			System.out.println(" d. Find the longest and shortest word");
			System.out.println(" e. exit");
			// get the user's input as the first character from the next line presented to
			// the scanner
			char input = scanner.nextLine().charAt(0);
			// switch statement based on the user's input
			switch (input) {
			case 'a':
				System.out.println("Please enter text for analysis:");
				userInput = scanner.nextLine();
				break;
			case 'b':
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("Please enter the name of the file");
			filename = scanner1.nextLine();
				TextFile file = new TextFile();
				userInput = TextFile.fromFile2(filename);
				break;
			case 'c':
				userInput = "Hi my name is Priya Ganger";
				System.out.println("User input: Hi my name is Priya Ganger");			
				break;
			case 'd':
				 length Length = new length();				
				 length.stringInput();
				break;
			case '5':
				System.out.println("Goodbye!");
				UsersChoice = false;
				break;
			default:
				System.out.println("Error, please try again.");
			}
			//calling the methods outside cases so that they are called in all cases
			getBarChart GetBarChart = new getBarChart();
			getBarChart.BarChart(userInput);
			RF relativeFrequency1 = new RF();
			RF.RFrequency(userInput);
			System.out.println();
		}

		// close system resources

		scanner.close();

	}

}