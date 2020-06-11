import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int j = scan.nextInt();
        double e = scan.nextDouble();
        scan.nextLine();
        String ss = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+j);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+e);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s.concat(ss));

        scan.close();

        /* Result:
        16
        8.0
        HackerRank is the best place to learn and practice coding!
         */

        /* Extra Materials:

        #Data Types       : Data types define and restrict what type values can be stored in a variable, as well as set
                            the rules for what types of operations can be performed on it.
        #Primitive Data Types
                          : Java has 8 primitive data types: byte, short, int, long, float, double, boolean, and char.
        #Scanner          : Scanner has some methods. Like, next, nextLine, hasNext, hasNextLine, readNext etc.
                            The next methods scan for tokens (you can think of this as a word), and the nextLine methods
                            reads from the Scanner's current location until the beginning of the next line. Each line of
                            multi-line input contains an invisible separator indicating that the end of a line of input
                            has been reached. When you use Scanner functions that read tokens (e.g.: next(), nextInt(),
                            etc.), the Scanner reads and returns the next token. When you read an entire line
                            (i.e.: readLine()), it reads from the current position until the beginning of the next line.
                            Because of this, a call to nextLine() may return an empty string if there are no characters
                            between the end of the last read and the beginning of the next line. For example, given the
                            following input:
                            a b c
                            d e
                            f
                            g

                            Explanation :
                            1. A call to scan.next(); returns the next token, a.
                            2. A call to scan.next(); returns the next token, b.
                            3. A call to scan.nextLine(); returns the next token, c. It's important to note that the
                               scanner returns a space and a letter, because it's reading from the end of the last token
                               until the beginning of the next line.
                            4. A call to scan.nextLine(); returns the contents of the next line, d e.
                            5. A call to scan.next(); returns the next token, f.
                            6. A call to scan.nextLine(); returns everything after f until the beginning of the next line;
                               because there are no characters there, it returns an empty String.
                            7. A call to scan.nextLine(); returns g.

                            Note: You will struggle with this challenge if you did not review this section. You must
                            understand what happens when you switch between reading a token (single word) of input and
                            reading an entire line of input to successfully complete this challenge.
         #Additive Operator :
                            The + operator is used for mathematical addition and String concatenation
                            (i.e.: combining two Strings into one new String). you can assign their result to another
                            variable using the assignment operator (=). You can also pass the result to a function
                            instead of assigning it to a variable
         */
    }
}
