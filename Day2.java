import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day2 {
    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost*tip_percent/100.0;
        double tax = meal_cost*tax_percent/100.0;
        double totalCost = meal_cost + tip + tax;
        System.out.println(Math.round(totalCost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();

        /* Result:

         */

        /* Extra Materials:
        #Arithmetic Operators : The binary operators used for arithmetic are as follows:
                                +: Additive
                                -: Subtraction
                                *: Multiplication
                                /: Division
                                %: Remainder (modulo)
        #Additional Operators : +: A binary operator used for String concatenation

                                ++: This unary operator is used to preincrement (increment by 1 before use) when
                                prepended to a variable name or postincrement (increment by 1 after use) when appended
                                to a variable.

                                --: This unary operator is used to predecrement (decrement by 1 before use) when
                                prepended to a variable name or postdecrement (decrement by 1 after use) when appended
                                to a variable.

                                !: This unary operator means not (negation). It's used before a variable or logical
                                expression that evaluates to true or false.

                                ==: This binary operator is used to check the equality of 2 primitives.

                                !=: This binary operator is used to check the inequality of 2 primitives.

                                <, >, <=, >=: These are the respective binary operators for less than, greater than,
                                less than or equal to, and greater than or equal to, and are used to compare two operands.

                                &&, ||: These are the respective binary operators used to perform logical AND and
                                logical OR operations on two boolean (i.e.: true or false) statements.

                                ? : This ternary operator is used for simple conditional statements (i.e.: if ? then : else).
         */
    }
}
