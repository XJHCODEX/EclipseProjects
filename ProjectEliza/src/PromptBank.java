import java.util.Scanner;
import java.util.Random;
public class PromptBank {
	 String [] questions;
	 String [] statements;
	 Random rand = new Random();
	public PromptBank(){
		//questions = new String[   ]; //initialize your array to the correct length to match your number of questions you populate it with
		//statements = //initialize your array to the correct length to match your number of questions you populate it with
		questions = new String[6];
		//Initialized array to correct length.
		statements = new String[6];
		//Initialized array to correct length.
		populateStatementsArray();
		populateQuestionsArray();
		//Since our arrays are in void methods, this is how we will return the values.
	}

	public void populateStatementsArray(){

		statements[0] = "Tell me more about BLANK1 and BLANK2.";
		statements[1] = "BLANK1 seems important to you, so does BLANK2 Please tell me more.";
		statements[2] = "BLANK1 and BLANK2 to be on your mind. Let's talk about it.";
		statements[3] = "BLANK1 and BLANK2 sound fun.";
		statements[4] = "I can see the correlation between BLANK1 and BLANK2.";
		statements[5] = "You always get so worked up talking about BLANK1 and BLANK2.";
		/*complete this method with your other statements using BLANK1 for word1
		 * and BLANK2 for word2 place holder 
		 */
	}
	public void populateQuestionsArray(){
		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
		questions[3]=  "What about BLANK1 and BLANK2 do you enjoy?";
		questions[4]=  "How do you feel about BLANK1 and BLANK2?";
		questions[5]=  "Can you say more about BLANK1 and BLANK2?";
		/*complete this method with your other questions using BLANK1 for word1
		 * and BLANK2 for word2 place holder 
		 */
	}
  
	public String getRandomStatementTrunk(){
	int rant = (int)(Math.random()*6);
	//Since our arrays length is 6, the "*'6'" is used to receive a random value within the array.
		String s = statements[rant];
		String statement = s;
		return statement;
		/*return statement will return which ever value of the array randomly selected
		 * and display our statement.
		 */
		//This is what we will be using to randomize the index within the array.
		//fill in the method so it randomly selects the statement template
		//from the questions array ... hint use Math.random() to get the random index
		//so you can replace BLANK1 and BLANK2 with the appropriate words
	}

	
	public String getRandomQuestionTrunk(){
		int rant = (int)(Math.random()*6);
		String q = questions[rant];
		String question = q;
		return question;
		
		//This is what we will be using to randomize the index within the array.
		//fill in the method so it randomly selects the question template
		//from the questions array ... hint use Math.random() to get the random index
		//so you can replace BLANK1 and BLANK2 with the appropriate words
	}
}
