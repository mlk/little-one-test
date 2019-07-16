package uk.me.michaellloydlee.teaching;

public class Lesson4IfStatements {

    /* We have now learnt about data (variables) and methods (code).
     * Next we need to make a computer do something interesting with the data.
     * Run this program (green arrow).
     * It always tell us that we are both too old AND too young!
     *
     * We meed to have the computer look at our age and make a decision based on it.
     * We can use an 'if' statement for this. And if statement looks like:
     *
     * if (boolean) {
     *    // code
     * }
     *
     * if is a keyword. Theses are special words Java understands. You are telling Java that you want it to make a decision.
     * booleam -> this is something that equals either true of false. You can use math stuff here like
     *            "==" equals (say 8 == 8 would be true, but 8 == 9 would be false)
     *            "<" less than (7 < 8  -- 7  is less than 8; true. 8 < 7 -- 8 is less than 7; false)
     *            ">" Greater than
     *            "<=" Less than or equals too.
     *            ">=" Greater than or equals too.
     * { .. }      Code that is only executed when the boolean is true.
     *
     * If we only want to show 'you are young' to people who are under 10 we could add an if statement around it.
     * if (age < 10) {
     *   Console.printLine("You are young.");
     * }
     *
     * Could you add a check to make only people over 45 'SOOO old'?
     */
    public static void main(String[] args) {
        Console.printLine("What is your name?");
        String name = Console.readLine();

        Console.printLine("How old are you?");
        int age = Console.readInt();

        Console.print("Your name ");
        Console.print(name);
        Console.print(" and you are ");
        Console.printInt(age);
        Console.print(" years old.");
        Console.printNewLine();

        Console.printLine("You are young.");
        Console.printLine("You are SOOO old!");
    }
}
