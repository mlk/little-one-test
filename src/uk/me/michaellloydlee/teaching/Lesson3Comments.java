package uk.me.michaellloydlee.teaching;

// This is a really quick one.
public class Lesson3Comments {
    // Comments are just text that the computer ignores
    // But people can read.

    /*
    You have three types of comments. Single line comments starting with '//'
    Multi line comments start with a /*, like this comment.
    And finally documentation starting with /**
     */

    /** The Say Hello method will display the word 'Hello' to the screen.
     */
    public static void sayHelloToYou() {
        Console.sayHello();
    }

    /*
    We will use a single line comment to tell you a bit about the code in question.
    In real life they should be used sparingly.
    But when learning they are super useful.
     */
    public static void main(String[] arg) {
        sayHelloToYou(); // Notice that when calling a method in the same class you don't need the class name.
    }
}
