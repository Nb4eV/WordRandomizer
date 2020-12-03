import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class WordShuffler {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a String variable: ");
		String String = scanner.nextLine();
		//Checks whether String is either blank or has only a "whitespace".
		if (String.isBlank()) {
			System.out.println("Please restart the program and input a String variable.");
		} else {
			
			//Splits String into words and puts them in "Words" array. Array output can be used for test purposes
			String[] Words = String.split("\\s+");
			System.out.println("String Array is: " + Arrays.toString(Words));
			//Counts the amout of words in the String. 
			System.out.println("The count of words in the String " + Words.length);
			//Converts from Array "Words" to ArrayList "WordsArrayList", after that words in ArrayList get shuffled randomly.
			ArrayList<String> WordsArrayList = new ArrayList<>();
			Collections.addAll(WordsArrayList, Words);
			Collections.shuffle(WordsArrayList);
			
			System.out.println("Randomized Input String");
			
			//Outputs the ArrayList.
			//The program asks whether the user wants output in one line or in place every word in different line.
			System.out.print("Print all words in one line?(y/n): ");
			String OutputCheck = scanner.nextLine();
			//If statement which outputs words in the way used wanted to.
			if ( OutputCheck.equals("y") ) {
				for (int i = 0; i < WordsArrayList.size();i++) 
			    { 		      
			        System.out.print(WordsArrayList.get(i) + " "); 		
			    }   
			} else if ( OutputCheck.equals("n") ) {
				for (int i = 0; i < WordsArrayList.size(); i++) 
				{
					System.out.println(WordsArrayList.get(i));
				}
			} else {
				System.out.println("Error | The User must input y/n at the last question.");
			}  
		}
	}
}
