import java.util.Random;
import java.util.Scanner;
import java.math.*;
/**
 *  A General ChatBot intended to carry on a conversation with the user.
 *
 * @author Jennifer Zhu
 * @version Date: 1/6/16
 *
 */
public class generalBot {

  /** array of sympathetic responses */
  private static final String[] cannedList = {"Be strong and persevere, I'm sure your day will get better", "Try being a rainbow in someone's cloud today, it could help you feel better", "It's okay to hurt once in awhile",
			"Awww, let's have a mini-dance party to cheer you up!", "Yesterday you said today, so JUST DO IT!", "Imagine some cute pugs, dressed up as superheroes...:)", "Nice!", "Hmmm..."};

  /** array of words that can be reflected */
  private static final String[] wordsCanBeReflected = {"I", "You", "I'm", "You're", "are", "am" };

  /** array of words that are reflections */
  private static final String[] reflectedWords = {"You", "I", "You're", "I'm", "am", "are" };

  /** private method to convert strings to integers */
  private static int convertToInt(String arg) {
    int myInt;
    try {
      myInt = Integer.parseInt(arg);
    } catch (Exception e) {
      myInt = 0;
    }
    return myInt;
  }

  private static ArrayList reflectWord(String word) {
    int indexOfWord =

  }

  /** method to create chatBot response from user input */
  private static String getChatBotResponse(String user) {
    String[] userwords = user.split[""];
    ArrayList<String> chatBot_response = new ArrayList<String>();
    for (String word: userwords) {
      if (wordsCanBeReflected.contains(word)) {
        chatBot_response.add(reflectWord(word));
      } else if (negativeWords.contains(word)) {
        // a way to pass information back to ONLY use responses from reaction to negative feelings list
      } else if (positiveWords.contains(word)) {
        // a way to pass info back to only use responses from reaction to positive feelings list
      }

  }
  /** method to get user input */
  //private static String userResponse()

	public static void main(String[] args) {

		Scanner user_input = new Scanner(System.in);

		System.out.println("Welcome to Jen Zhu's very first ChatBot!");

		// Get how many rounds user would like
		System.out.println("How many interactions would you like to have? This is the number of total responses.");
		String string_rounds = user_input.nextLine();
    int rounds = convertToInt(string_rounds);

    // create an array to store responses
    String[] conversation = new String[rounds];

		String Elsa1 = "Hi there! What's on your mind? ";
    conversation[0] = Elsa1;

    // variable to keep track next index in conversation array
    int count = 1;

    while (conversation.length < 8) {
      conversation[count] = user_input.nextLine();
      String chatBot_response = getChatBotResponse(conversation[count]);
      count++;
      System.out.println(chatBot_response);
      conversation[count] = chatBot_response;
      count++;
    }

	}

}
