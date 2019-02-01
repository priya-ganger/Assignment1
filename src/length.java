import java.util.Scanner;

public class length {
	// public static void main(String[] args) {

	public static void stringInput() {

		Scanner keyboard = new Scanner(System.in);
		int countWords = 0;
		String word = "";
		String longestWord = "";
		String shortestWord = "";
		//user input
		while (!word.equals("DONE")) {
			System.out.print("Please enter a word and press enter to store them. Press DONE to exit: ");
			word = keyboard.next();
			if (!word.equals("DONE")) {
				countWords++;
				if ((countWords == 1) || (word.length() < shortestWord.length())) {
					shortestWord = word;
				}
				if (word.length() > longestWord.length()) {
					longestWord = word;
				}
			}
		}
		
		//until the user enter DONE this is an infinite loop. Words entered will be stored in countWords. if this is shorter than the word = shortest word
		//if longer then = shortest word
		System.out.println("Thank you for entering " + countWords + " words.");
		System.out.println("Your longest word is :" + longestWord);
		System.out.println("Your shortest word :" + shortestWord);
	}

}
