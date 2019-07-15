package uk.me.michaellloydlee.teaching;

import java.util.Scanner;

/** A helper class to make showing information a little easier.
 *
 * Don't worry too much about how it does what it does.
 *
 */
public class Console {
    // A Lesson1HellWorld said, classes are Data and Methods. This is an example of some Data
    // private static <- Again don't worry about this for now.
    // Scanner        <- Data has a type, and in Java you have to say what that data holds. This piece of data can only hold 'Scanner's.
    // =              <- Like in Math this means 'equals', you are telling Java what this piece of data is.
    // new ...        <- Don't worry about all this for now.
    private static Scanner scanner = new Scanner(System.in).useDelimiter("\n+");


    // This is a method like 'main' before.
    // void        <- Like main it does not return any data.
    // println     <- This method is called `printLine`
    // String data <- Classes are not the only thing that has data. Method do as well. This method takes in input of a String.
    // { .. }      <- The code to make this happen. Don't worry about this for now.
    // You can use this method in your code, so in `Lesson1HelloWorld`
    public static void printLine(String data) {
        System.out.println(data);
    }


    // This is a method call 'sayHello'
    // You can use this in your 'main' method by calling
    // Console.sayHell();
    // Console  <- The name of the class that holds this method.
    // .        <- 'I want to use something in that class.
    // sayHello <- The method name.
    // ()       <- The input to
    // { ... }  <- The implementation of the method 'sayHello'.
    // Try editing Lesson1HelloWorld to call 'sayHello' and then click on the green arrow.
    public static void sayHello() {
        Console.printLine("Hello");
    }

    // This is a different method, it will say 'World'.
    // Can you make Lesson1HelloWorld say 'Hello World'?
    public static void sayWorld() {
        Console.printLine("World");
    }

    // Look at the implementation of both 'sayHello' and 'sayWorld', they both just call an existing method in the
    // Console class, but instead of passing in nothing () they pass in what they want to say in quotes.
    // Do you think you can make Lesson1HelloWorld say 'Hello <your name>'?

    public static String readLine() {
        return scanner.nextLine();
    }

    public static int readInt() {
        return scanner.nextInt();
    }

    public static double readDouble() {
        return scanner.nextInt();
    }
}
