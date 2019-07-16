package uk.me.michaellloydlee.teaching;

public class Lesson2UsingDataInMethods {

    // In this lesson we will look at using data in a method.
    // We call this a 'variable', a variable is some data that can change.
    // A variable has three parts:
    // 1. The type. This restricts the sort of data you can store. Some example types include:
    //    String: This is some text like a sentence or a name.
    //    int   : An integer value like 1 or 40.
    //    double: a real value like 3.15.
    // 2. The name.
    // 3. The value. A variable can only contain data in the type that is specified. Try changing the variable 'myName'
    //    to an int. You now have red lines everywhere because Java does not allow you to store the String (text) "Jeff"
    //    in a integer value. Change it back to a String.
    public static void main(String[] arg) {
        Console.printLine("What is your name?");
        String myName = "Jeff";

        // Notice the different method, can you see the difference in the output?
        Console.print("Your name is ");
        Console.printLine(myName);
    }

    // Remember when we looked at the methods in 'Console' and we talked about how a method could return information?
    // We can use this here, at the moment our variable contains the String "Jeff", but we really want to to contain
    // your name, or my name, or whoever is running the programs name.
    // Do do this we need to call the method that asks the user for some data and returns it.
    // This method is the Console.readLine() method.
    // Lets change myName so it instead calls the method.
    // String myName = Console.readLine();
    // Now lets run the application (the green arrow).
    // The application has asked for a name then stopped. Click in the Run window and type your name and hit 'Enter'.
    // You have now feed data into your application and printed it back out! Awesome!
    // Can you now make the application ask for you name and your age?
    // Look up the methods: Console.readInt() and Console.printInt(<data>)
    // Remember that you will need to use the type 'int' not the type 'String'
}
