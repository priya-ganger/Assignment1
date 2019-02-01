import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class TextFile {

	// public static void main(String[] args) throws FileNotFoundException {

	static String fromFile2(String filename) {

		String userInput = "", lowercaseName = "";

		Scanner scanner = new Scanner(System.in);

		Scanner sc;
		try {
			sc = new Scanner(new FileInputStream(filename));

			while (sc.hasNextLine()) {

				userInput += " " + sc.nextLine();

				lowercaseName = userInput.toLowerCase();

			}
			
			//go through each line in the text file and when that line comes to the end + the next line.
			//this groups each line to the next so the scanner reads the document as a whole and produces one result.

		} catch (FileNotFoundException e) {

			System.out.println("Sorry file not found. Please try again/enter the full path");
		}//try-catch error handling if the file is not found.
		return lowercaseName;
	}
}

