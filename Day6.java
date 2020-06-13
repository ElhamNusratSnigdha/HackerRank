import java.io.*;
import java.util.*;
public class Day6 {
    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ens = new Scanner(System.in);
        int T = ens.nextInt();
        ens.nextLine();
        for (int k = 1; k <= T; k++) {
            String S = ens.nextLine();
            int N = S.length();
            String even = "";
            String odd = "";

            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    even = even + S.charAt(i);
                } else {
                    odd = odd + S.charAt(i);
                }
            }
            System.out.println(even + " " + odd);
        }
        ens.close();
        /* Extra Materials:
        #Strings and Characters :
                             a String is a sequence of characters. In the same way that words inside double quotes
                             signify a String, a single letter inside single quotes signifies a character. Each
                             character has an ASCII value associated with it, which is essentially a numeric identifier.
                             The code below creates a char variable with the value "c", and then prints its ASCII value.
                             Example:
                             char myChar = 'c'; // create char c
                             System.out.println("The ASCII value of " + myChar + " is: " + (int) myChar);
                             Result:
                             The ASCII value of c is: 99

                             Observe the (int) before the variable name in the code above. This is called explicit
                             casting, which is a method of representing one thing as another. Putting a data type inside
                             parentheses right before a variable is essentially saying: "The next thing after this should
                             be represented as this data type". Casting only works for certain types of relationships,
                             such as between primitives or objects that inherit from another class.

                             To break a String down into its component characters, you can use the "String.toCharArray"
                             method. For example, this code:
                             Example:
                             String myString = "This is String example.";
                             char[] myCharArray = myString.toCharArray();
                             for(int i = 0; i < myString.length(); i++){
                                // Print each sequential character on the same line
                                System.out.print(myCharArray[i]);
                             }
                             // Print a newline
                             System.out.println();

                             Result:
                             This is String example.

                             Notice that we were able to simulate printing myString by instead printing each individual
                             character in the character array, myCharArray, created from myString.
         */
    }
}
