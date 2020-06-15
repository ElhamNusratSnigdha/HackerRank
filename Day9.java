import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day9 {
    // Complete the factorial function below.
    static int factorial(int n) {
        if(n<=1) return 1;
        else return n*factorial(n-1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException{


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        System.out.println(result);

        scanner.close();

        /* Extra Materials:
        #Recursion        : This is an algorithmic concept that involves splitting a problem into two parts: a base case
                            and a recursive case.
                            The problem is divided into smaller subproblems which are then solved recursively until such
                            time as they are small enough and meet some base case; once the base case is met, the solutions
                            for each subproblem are combined and their result is the answer to the entire problem.

                            If the base case is not met, the function's recursive case calls the function again with modified
                            values. The code must be structured in such a way that the base case is reachable after some
                            number of iterations, meaning that each subsequent modified value should bring you closer and
                            closer to the base case; otherwise, you'll be stuck in the dreaded infinite loop!

                            Example:
                            The code below produces the multiple of two numbers by combining addition and recursion:

                            // Multiply 'n' by 'k' using addition:
                            private static int nTimesK(int n, int k) {
                                System.out.println("n: " + n);
                                // Recursive Case
                                if(n > 1) {
                                    return k + nTimesK(n - 1, k);
                                }
                                // Base Case n = 1
                                else {
                                    return k;
                                }
                            }
                            public static void main(String[] args) {
                                int result = nTimesK(4, 4);
                                System.out.println("Result: " + result);
                            }

         */
    }
}