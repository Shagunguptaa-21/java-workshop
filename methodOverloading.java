//Method overloading in java 
//real life example of method overloading in java
//method overloading is a feature in java that allows a class to have more than one method with 
//the same name, as long as their parameter lists are different.
//This can be useful for creating methods that perform similar tasks but with different type 
//Speaker class with overloaded methods

class Speaker {

    // Method to speak a message
    public void speak(String message) {
        System.out.println("speaker says: " + message);
    }

    // Overloaded method to speak a message with a volume level
    public void speak(String message, int volume) {
        System.out.println("Speaker says: " + message + " at volume " + volume);
    }

    // Overloaded method to speak a message in a specific language
    public void speak(String message, String language) {
        System.out.println("Speaker says: " + message + " in " + language);
    }
}

//calling above method to speak in main method
public class methodOverloading {
    public static void main(String[] args) {
        Speaker speaker = new Speaker();

        //calling the first speak method as the 
        speaker.speak("Hello, World!");

        //calling the second speak method with volume
        speaker.speak("Hello, World!" , 5);

        //calling the third
        speaker.speak("Hello, World!", "English");
    }
}
