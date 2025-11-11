//Write a program to find out number of vowels and consonants into the given sentence.

import java.util.Scanner; // importing Scanner class for user input

/*---------- Class for Character based operation -------------*/
class StringCharacterOperation
{
	/*--- Method to count number of vowels ---*/
	public static int countVowels(String sentence)
	{
		int vowels = 0; // to count vowels
		char character; // to fetch each character
		
		for(int index = 0; index < sentence.length(); index++)
		{
			character = sentence.charAt(index); // extract character at given index
			char lowerChar = Character.toLowerCase(character); // convert to lowercase for easy comparison
			
			// check if it is a vowel
			if(lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u')
			{
				vowels++;
			}
		}
		// return count of vowels
		return vowels;
	}
	
	/*--- Method to count number of consonants ---*/
	public static int countConsonants(String sentence)
	{
		int consonants = 0; // to count consonants
		char character; // to fetch each character
		
		for(int index = 0; index < sentence.length(); index++)
		{
			character = sentence.charAt(index);
			char lowerChar = Character.toLowerCase(character);
			
			// check if it is an alphabet and not a vowel
			if((lowerChar >= 'a' && lowerChar <= 'z') && 
			   !(lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u'))
			{
				consonants++;
			}
		}
		// return count of consonants
		return consonants;
	}
	
	/*--- Method for counting total alphabets (vowels + consonants) ---*/
	public static int countAlphabets(String sentence)
	{
		int alphabets = countVowels(sentence) + countConsonants(sentence);
		return alphabets;
	}
}

/*-------- Initial class ----------------------*/
public class StringOperation {

	public static void main(String[] args) {
		// creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any sentence: ");
		String sentence = sc.nextLine();
		
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of characters: " + sentence.length());
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of Vowels: " + StringCharacterOperation.countVowels(sentence));
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of Consonants: " + StringCharacterOperation.countConsonants(sentence));
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of Alphabets: " + StringCharacterOperation.countAlphabets(sentence));
		System.out.println("------------------------------------------------------");

		sc.close();
	}
}
