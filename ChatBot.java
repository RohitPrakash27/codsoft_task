import java.util.regex.Pattern;
import java.util.*;

public class ChatBot {
	public static String getResponse(String UserInput)
	{
		UserInput =UserInput.toLowerCase();
		if(Pattern.matches("hi|hello",UserInput)) {
			return "Hello! Greetings, How can I help you today?";
		}
		else if(Pattern.matches("what is your name\\?", UserInput)) {
			return "I'm just a Chatbot, I don't have a specific name.";		
		}
		else if(Pattern.matches("how can i call you\\?", UserInput)) {
			return "You can call me Chatbot";
		}
		else if(Pattern.matches("how you doing\\?|how are you\\?", UserInput)) {
			return "I'm doing Great, thanks for asking. What about you?";
		}
		else if(Pattern.matches("i'm fine", UserInput)) {
			return "That's Good, How can I Assist you Today?";
		}
		else if(Pattern.matches("Bye", UserInput)) {
			return "Goodbye!, Have a nice day!";
		}
		else {
			return "I'm not sure I understand. Can you please rephrase?";
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Chatbot : Hi! I'm a simple Chatbot. Type 'bye' to exit.");
		while(true)
		{
			System.out.print("You: ");
			String UserInput=sc.nextLine();
			if(UserInput.equalsIgnoreCase("bye")) {
				System.out.println("Chatbot: Goodbye! Have a nice day!");
				break;
			}
			String response=getResponse(UserInput);
			System.out.println("Chatbot: "+response);
		}
		sc.close();
	}
}
