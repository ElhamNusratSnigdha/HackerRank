import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Plus_Minus {

            // Complete the plusMinus function below.
            static void plusMinus(int[] arr) {
                int positiveC=0;
                int negativeC=0;
                int zeroC=0;
                float positive;
                float negative;
                float zero;

                for(int i=0;i<arr.length;i++){
                    if(arr[i]>0){
                        positiveC++;
                    }
                    else if(arr[i]<0){
                        negativeC++;
                    }
                    else{
                        zeroC++;
                    }
                }
                positive=(float)positiveC/arr.length;
                negative=(float)negativeC/arr.length;
                zero=(float)zeroC/arr.length;
                System.out.printf("%.6f",positive);
                System.out.println();
                System.out.printf("%.6f",negative);
                System.out.println();
                System.out.printf("%.6f",zero);
            }

            private static final Scanner scanner = new Scanner(System.in);

            public static void main(String[] args) {
                int n = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                int[] arr = new int[n];

                String[] arrItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int i = 0; i < n; i++) {
                    int arrItem = Integer.parseInt(arrItems[i]);
                    arr[i] = arrItem;
                }

                plusMinus(arr);

                scanner.close();

                /* Extra Materials:
                #Java Precision   : "printf()" method is part of the java.io.PrintStream class
                                    System.out.printf(format, arguments);
                                    System.out.printf(locale, format, arguments);

                                    We specify the formatting rules using the format parameter. Rules start with the ‘%' character.
                                    System.out.printf("Hello %s!%n", "World");
                                    output:
                                    Hello World!
                                    As shown above, the format string contains plain text and two formatting rules.
                                    The first rule is used to format the string argument. The second rule adds a newline
                                    character to the end of the string.

                                    String formato = String.format("%.2f");
                                    It sets the precision to 2 digits.
                                    If you only want to print, use it this way:
                                    System.out.printf("%.2f",123.234);

                                    Or, example:
                                    public static void main(String[] s) {
                                        Double d = Math.PI;
                                        d = Double.parseDouble(String.format("%.3f", d));  // can be required precision
                                        System.out.println(d);
                                    }

                                    Format specifiers include flags, width, precision, and conversion characters in the
                                    following sequence:
                                    %[flags][width][.precision]conversion-character //Specifiers in the brackets are optional.

                                    The conversion-character is required and determines how the argument is formatted.
                                    Conversion characters are only valid for certain data types. Some common ones are:
                                    s – formats strings
                                    d – formats decimal integers
                                    f – formats the floating-point numbers
                                    t– formats date/time values

                 #Line Separator  : To break the string into separate lines, we have a %n specifier:
                                    System.out.printf("baeldung%nline%nterminator");
                                    Output:
                                    baeldung
                                    line
                                    terminator
                 #Boolean Formatting :
                                    To format boolean values, we use the %b format. It works the following way: If the
                                    input value is true, the output is true. Otherwise, the output is false.
                                    System.out.printf("%b%n", null);
                                    System.out.printf("%B%n", false);
                                    System.out.printf("%B%n", 5.3);
                                    System.out.printf("%b%n", "random text");

                                    Output:
                                    false
                                    FALSE
                                    TRUE
                                    true
                                    //Notice that we can use %B for uppercase formatting.
                 #String Formatting :
                                    To format a simple string, we'll use the %s combination. Additionally, we can make
                                    the string uppercase:
                                    printf("'%s' %n", "baeldung");
                                    printf("'%S' %n", "baeldung");

                                    Output:
                                    'baeldung'
                                    'BAELDUNG'
                                    Also, to specify a minimum length, we can specify a width:
                                    printf("'%15s' %n", "baeldung");

                                    Output:
                                    '       baeldung'

                                    If we need to left-justify our string, then we can use the ‘-‘ flag:
                                    printf("'%-10s' %n", "baeldung");

                                    Output:
                                    'baeldung  '

                                    Even more, we can limit the number of characters in our output by specifying a precision:
                                    System.out.printf("%2.2s", "Hi there!");
                                    The first ‘x' number in %x.ys syntax is the padding. ‘y' is the number of chars.
                                    For our example here, the output is Hi.

                 Fore more: https://www.baeldung.com/java-printstream-printf
                 */

    }
}
