import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String time){
        return String.format("Good %s, %s. It is wonderful to see you", time, name);
    }

    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("It is %s", new Date());
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("!") > -1){
            return "Right away!";
        }
        if(conversation.indexOf("Alfred") > -1) {
            return "At your service!";
        }
        if(conversation.indexOf("Batman") > -1) {
            return "I'm Batman!";
        }
    return "GoodBye!";
    }


	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

