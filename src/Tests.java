
public class Tests {
	
	
	{
		//Bar chart was tested visually for each test 1 to 20 as well as using sentences and paragraphs using both user input and from a text file.
		
			//Frequency of character
			
			//Test 1 - Input: {"abcdef"}   	  Output: 1,1,1,1,1    Reason: If all single characters are counted
			//Test 2 - Input: {"1,2,3,4,5"}   Output: 1,1,1,1,1    Reason: If all single numbers are counted
			//Test 3 - Input: {". , ! [ ]"}   Output: 1,1,1,1,1    Reason: If all single special characters are counted
			
			
		
			//Test 4 - Input: {"AAaa"}         Output: 4    Reason: If all strings upper and lowercase counted 
			//Test 5 - Input: {"AAAA"}         Output: 4    Reason: If all strings uppercase counted 
			//Test 6 - Input: {"aaaa"}         Output: 4    Reason: If all strings lowercase counted
			
			
			
			//Test 7 - Input: {"1hello","1Hello" "1HeLLo"}      Output: 1,1,1,2,1 for each  Reason: If all strings including letters and number counted. uppercase,lowercase & mixed
			//Test 8 - Input: {"!yh","/YH","&yH]"}         		Output: 1,1,1  for each    Reason: If all strings including letters and punctuation counted. uppercase,lowercase & mixed
			//Test 9 - Input: {"/3","/5","/8"}         			Output: 3,3,3 for each   Reason: If all strings including punctuation and number counted
			//Test 10 - Input: {"a2!","A2%","A/9"}         		Output: 3,3,3 for each    Reason: If all strings are numbers letters and punctuation 
			
			
			//Relative frequency of each character
			
			//Test 11 - Input: {"abcdef"}   	  Output: 0.16666667 for each    Reason: If all single characters produce correct relative frequency
			//Test 12 - Input: {"1,2,3,4,5"}   Output: 0.16666667 for each    Reason: If all single numbers produce correct relative frequency
			//Test 13 - Input: {". , ! [ ]"}   Output: 0.16666667 for each    Reason: If all single special characters produce correct relative frequency
			
			
		
			//Test 14 - Input: {"AAaa"}         Output: 1.0 for each    Reason: If all strings upper and lowercase produce correct relative frequency
			//Test 15 - Input: {"AAAA"}         Output: 1.0 for each    Reason: If all strings uppercase produce correct relative frequency
			//Test 16 - Input: {"aaaa"}         Output: 1.0 for each    Reason: If all strings lowercase produce correct relative frequency
			
			
			
			//Test 17 - Input: {"1hello","1Hello" "1HeLLo"}          Output:  0.16666667,  0.16666667  0.16666667, 0.33333334  0.16666667  Reason: If all strings including letters and number (uppercase,lowercase & mixed) produce correct relative frequency
			//Test 18 - Input: {"!yh","/YH","&yH]"}         			Output: 0.33333334  for each    Reason: If all strings including letters and punctuation (uppercase,lowercase & mixed) produce correct relative frequency
			//Test 19 - Input: {"/3","/5","/8"}         				Output: 0.5 for each   Reason: If all strings including punctuation and number produce correct relative frequency
			//Test 20 - Input: {"a2!","A2%","A/9"}         			Output: 0.33333334 for each    Reason: If all strings numbers, letters and punctuation produce correct relative frequency
		
		
	//number of words
		//Test 21 - Input: {"Hello"}          		Output: 1   Reason: If all single are counted as words
		//Test 22 - Input: {"Hello hello hello"}    Output: 3    Reason: If all multiple  strings are counted as words
		//Test 23 - Input: {"hello1234 hello1234 hi1234"}       Output: 3   Reason: If all multiple  strings including numbers are counted as words
		//Test 24 - Input: {"hi!!!! hi!!!! hi!!!!"}       Output: 3  for each    Reason: If all multiple  strings including punctuation are counted as words
	}
}

			
		
	

