import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Day3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            if (N % 2 != 0) {
                System.out.println("Weird");
            } else {
                if (1 < N && N < 6) {
                    System.out.println("Not Weird");
                } else if (5 < N && N < 21) {
                    System.out.println("Weird");
                } else if (N > 20) {
                    System.out.println("Not Weird");
                }

            }
            scanner.close();

    /* Result:
        Hello, World.
        Welcome to 30 Days of Code!
         */

        /* Extra Materials:
        #Boolean          : A logical statement that evaluates to true or false. In some languages, true is
                            interchangeable with the number 1 and false is interchangeable with the number 0.
        #Conditional Statements :
                            A way of programming different workflows depending on some boolean condition.
                            Example :
                            if(condition) {
                                // do this if 'condition' is true
                            }else {
                                // do this if 'condition' is false
                            }
        #Logical Operators: Customize your condition checks by using logical operators.

                            || is the OR operator, also known as logical disjunction.
                            && is the AND operator, also known as logical conjunction.
                            ! is the NOT operator, also known as negation.

                            Examples :
                            // if A is true and B is true, then C
                            if(A && B){C;}
                            // if A is true or B is true, then C
                            if(A || B){C;}
                            // if A is false (i.e.: not true), then B
                            if(!A){B;}

                            Another great operator is the ternary operator for conditional statements (? :).
                            Let's say we have a variable,v, and a condition,c. If the condition is true, we want v to be
                            assigned the value of a; if condition c is false, we want v to be assigned the value of b.
                            We can write this with the following simple statement:
                            v = c ? a : b;
                            In other words, you can read c ? a : b as "if c is true, then a; otherwise,b; Whichever value
                            is chosen by the statement is then assigned to v.
         #Switch Statement: This is a great control structure for when your control flow depends on a number of known
                            values.
                            Let's say we have a variable "condition" whose possible values are "val0", "val1", "val2"
                            and each value has an action to perform (which we will call some variant of "behavior").
                            We can switch between actions with the following code:
                            Example :
                            switch (condition) {
                                case val0: 	behavior0;
                                            break;
                                case val1:	behavior1;
                                            break;
                                case val2:	behavior2;
                                            break;
                                default: 	behavior;
                                            break;
                            }
                            Note: Unless you include break; at the end of each case statement, the statements will
                            execute sequentially. Also, while it's good practice to include a default: case (even if
                            it's just to print an error message), it's not strictly necessary.
         */
    }
}
