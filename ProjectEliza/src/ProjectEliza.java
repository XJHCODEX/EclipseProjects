/*https://www.youtube.com/watch?v=qV_w3ptbCO4&ab_channel=JeremyHernandez
Video quality is better on normal view.*/
import java.util.Scanner;
public class ProjectEliza 
{
	public static String replaceWordsPromptBank(String sentence, String pbSentence)
	{
		String[] parts = sentence.split(" ");
		//We use <String>.split() splits the the string into multiple strings.
		String word1 = parts[0];
		//Take the index of the first word which is <String>[0]
		String word2 = parts[parts.length-1];
		//Take the index of the last word in the sentence and -1 to the length of parts.
		String replaceWords = pbSentence.replace("BLANK1",word1);
		/*Here we create a string called replaceWords, which is going to be used for replacing BLANK1
		With the first word (word1)*/
		return replaceWords.replace("BLANK2",word2);
		//This returns the replaceWords but with BLANK2 replaced with the last word (word2).
	}
	public static void main(String [] args)
	{
		PromptBank promptbank = new PromptBank();
		//our object named prompbank, because we are calling our methods from class PromptBank.
		Scanner scnr = new Scanner(System.in);
		boolean stop = false;
		while(!stop) {
			//while (boolean) stop isn't false it will be equivalent to true, the program will continue.
			System.out.print("ELIZA:  ");
			System.out.println("Hello, my name is Eliza. What is your name?");
			//In this part of the program the AI (ELIZA) asks the user for their name.
			System.out.print("USER:   ");
			String user;
			user = scnr.nextLine();
			/*Scanning for the name of the user or <Input>, it will be saved 
			and used for the next prompt.*/
			System.out.print("ELIZA:  ");
			System.out.println("Hello " + user + ". Tell me what is on your mind today in 1 sentence.");
			String sentence ="";
			while(!sentence.equalsIgnoreCase("EXIT")){
			//while the input of the user doesn't equal "EXIT" (case insensitive), enter while loop.
			System.out.print("USER:   ");
			sentence = scnr.nextLine();
			//String sentence will be our user input.
			if(!sentence.equalsIgnoreCase("EXIT")) {
				//if user input doesn't equal EXIT, enter if.
				if(sentence.charAt(sentence.length()-1)=='?') 
					/*using <String>.charAt to receive our index from left to right.
					here we are evaluating the punctuation of our user input, 
					so we want the last index
					within the length - 1.
					In this if statement we are looking for the punctuation '?'.*/
				{
				String pbSentence = promptbank.getRandomQuestionTrunk();
				String op = replaceWordsPromptBank(sentence.replace('?',' '),pbSentence);
					/*Our string pbSentence equals our object 'promptbank'.getRandomQuestionTrunk();
					which will allow us to call our random questions method from class PromptBank. */
				System.out.println("ELIZA:  " + op);
				}
				else if(sentence.charAt(sentence.length()-1)=='!') 
					//In this if statement we are looking for the punctuation '!'.
				{
				String pbSentence = promptbank.getRandomStatementTrunk();
					/*Our string pbSentence equals our object 'promptbank'.getRandomStatementTrunk();
					which will allow us to call our random statements method from class PromptBank. */
				String op = replaceWordsPromptBank(sentence.replace('!',' '),pbSentence);
				System.out.println("ELIZA:  WOW! Dramatic! " + op);
				}
				else if(sentence.charAt(sentence.length()-1)=='.')
					//In this if statement we are looking for the punctuation '."
				{
				String pbSentence = promptbank.getRandomStatementTrunk();
					/*Our string pbSentence equals our object 'promptbank'.getRandomStatementTrunk();
					which will allow us to call our random statements method from class PromptBank. */
				String op = replaceWordsPromptBank(sentence.replace('.',' '),pbSentence);
				System.out.println("ELIZA:  " + op);	
				}
			}
			if(sentence.equalsIgnoreCase("EXIT"))
				//Enters if statement when user input equals "EXIT" (case insensitive)
			{
				System.out.println("ELIZA:  Do you want to run the session again?");
				//Asks user if they want to run the session again.
				System.out.print("USER:   ");
				sentence = scnr.nextLine();
				if(sentence.equalsIgnoreCase("NO"))
				{
					//if user inputs "NO" (case insensitive) it will enter.
					System.out.println("ELIZA:  Goodbye, until next time");
					//Replies with "Goodbye, until next time"
					System.exit(0);
					//terminates program
				}
				if(sentence.equalsIgnoreCase("YES"))
				{
					stop = false;
					/*if user inputs "YES" (case insensitive) program begins again.
					 because of our boolean (stop) = false.*/
				}			
				break;
				/*A break here so that it breaks through the if(!sentence.equalsIgnoreCase("EXIT"))
				back into the while loop in the beginning.*/
			}
		}
	}
		/*(User inputs for grading purposes)
		 * WonderWoman
		 *Today is Friday.
		 *Friday is a fantastic day.
		 *Why do want me to talk about Friday?
		 *No!
		 *I want to talk about the project.
		 *EXIT
		 *No
		 */
}
}
