import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Day7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        for(int j = n-1;j>0;j--){
            System.out.print(a[j]+" ");
        }
        System.out.println(a[0]);
        scanner.close();

        /* Extra Materials:
        #Data Structures : A way of organizing data that enables efficient storage, retrieval, and use.
        #Arrays          : A type of data structure that stores elements of the same type (generally).
                           It's important to note that you'll often see arrays referred to as "A" in documentation, but
                           the variable names you use when coding should be descriptive and begin with lowercase letters.
                           You can think of an array "A" of size "n" as a contiguous block of cells sequentially indexed
                           from 0 to n-1 which serve as containers for elements of the array's declared data type. To
                           store an element "value" in some index "i" of array "A" use the syntax A[i] and treat it as
                           you would any other variable (i.e., A[i] = value;). For example, the following code:
                           // the number of elements we want to hold
                           final int _arraySize = 4;
                           // our array declaration
                           String[] stringArray = new String[_arraySize];
                           for(int i = 0; i < _arraySize; i++) {
                                // assign value to index i
                                stringArray[i] = "This is stored in index " + i;

                                // print value saved in index i
                                System.out.println(stringArray[i]);
                           }

                           saves and then prints the values listed below in their respective indices of "stringArray":
                           This is stored in index 0
                           This is stored in index 1
                           This is stored in index 2
                           This is stored in index 3

                           Most languages also have a method, attribute, or member that allows you to retrieve the size
                           of an array. In Java, arrays have a "length" attribute; in other words, you can get the length
                           of some array, arrayName, by using the arrayName.length syntax.

                           Note: The final keyword used in the code above is a means of protecting the variable's value
                           by locking it to its initialized value. Any attempt to reassign (overwrite) the value of a
                           final variable will generate an error.

         */
    }
}
