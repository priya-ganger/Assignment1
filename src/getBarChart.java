import java.util.Scanner;

public class getBarChart {

	static void BarChart(String userInput) {

	//	System.out.print("Please enter your sentence: ");

		Scanner sc = new Scanner(System.in);

		String lowercaseName = userInput.toLowerCase();
		// changing users string to lowercase so that both uppercase and lowercase
		// characters are treated as one character in the count.
		int[] arrayOfCharacters = new int[126];
		// declaring an array of the ascii values.
		for (int i = 0; i < lowercaseName.length(); i++) {

			char character = lowercaseName.charAt(i);

			int ascii = (int) character;

			arrayOfCharacters[ascii]++;

		}

		// this for loop is going through the length of the users string and
		// initializing them as characters and assigning them ascii values.

		// this for loop is for the y axis of the bar chart.
		// the highest frequency will tell the y axis what length to be depending on the
		// different characters count.
		// for e.g if the maximum count of the characters in the string if 5 then the y
		// axis will go upto 5.
		int highestFrequency = 0;

		for (int i = 0; i < arrayOfCharacters.length; i++) {

			if (arrayOfCharacters[i] > highestFrequency) {

				highestFrequency = arrayOfCharacters[i];

			}

		}

		int count = highestFrequency;

		while (count > 0) {

			System.out.printf("\n% -4d|", count);

			for (int i1 = 0; i1 < arrayOfCharacters.length; i1++) {

				if (arrayOfCharacters[i1] > 0) {

					if (arrayOfCharacters[i1] >= count) {

						System.out.print("  *   ");

					} else {

						System.out.print("      ");

					}

				}

			}

			count--;

		}

		System.out.println();

		// assigning the count to highest frequency. when going through the array, if
		// the value is greater than 0 print a star.
		// if the value is not greater that 0 print an asterick. this is essential to
		// make sure the astericks are lined up correctly.

		System.out.print("_____");

		// next for loops are for the x-axis.
		for (int i1 = 0; i1 < arrayOfCharacters.length; i1++) {

			if (arrayOfCharacters[i1] > 0) {

				System.out.print("______");

			}

		}

		// go through the arrays length and format for every character if the count if
		// greater than 0
		System.out.println();

		System.out.printf("%5s", "|");

		for (int i = 0; i < arrayOfCharacters.length; i++) {

			if (arrayOfCharacters[i] > 0) {

				System.out.print("  " + (char) i + "  |");

			}

		}
		// go through the array and if the count is greater than 1 print out the
		// formatting and character on the x axis.

		System.out.println();

		System.out.println();

		// this takes in the string. It runs through each word and +1 to the count and
		// prints the count for no. of words.

		sc = new Scanner(userInput);

		int counter = 0;

		while (sc.hasNext()) {

			sc.next();

			count++;

		}

		System.out.println("Number of words: " + count);

	}

}
