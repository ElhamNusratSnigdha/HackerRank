import java.util.*;
public class Day0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();

        System.out.println("Hello, World.");

        System.out.println(inputString);
        scan.close();

        /* Result:
        Hello, World.
        Welcome to 30 Days of Code!
         */

        /* Extra Materials:
        #Class :      A class is a collection of variables (fields) and functions called methods.
                      A program is a collection of classes. When declaring a class, the name should
                      always start with a capital letter or use CamelCase;
                      Note: Class names cannot begin with numbers or contain any spaces.
                      Example: class MyClass{}
        #Variable :   Think of this as a name (identifier) that points to (references) a location
                      in memory where information associated with that name can be stored.
                      t is a best practice to always start variable names with a lowercase letter
                      and use CamelCase for variable names. Variable names cannot contain spaces or
                      special characters (except underscores), though they can contain
                      (but not begin with) numbers. Each variable has a data type associated with it,
                      which essentially restricts what that variable is allowed to reference.
                      Example: DataType myVariable = value;
                      Note: The = operator is called the assignment operator, so you should
                      interpret = as the English phrase "[left operand] is assigned
                      the value of [right operand]".
        #Function :   A sequence of packaged instructions that perform a task.
        #Method :     In Object-Oriented programming, a method is a type of function that operates
                      on the fields of a class.
                      Example:
                      int myMethod(){
                            // ...does cool stuff.
                      }
                      void myMethod(int myInt){
                            // ...does cool stuff.
                      }
        #Object :     An Object is an instance (or variable) of a class.
        #Stream :     Think of this as the flow of data from one place to another. Most of our
                      challenges require you to read input from System.in (also known as stdin,
                      the standard input stream), and write output to System.out (also known
                      as stdout, the standard output stream).
                      Example:
                      Scanner scan = new Scanner(System.in);
                      Uses:
                      scan.next(); // returns the next token of input
                      scan.hasNext(); // returns true if there is another token of input (false otherwise)
                      scan.nextLine() // returns the next LINE of input
                      scan.hasNextLine(); // returns true if there is another line of input

                      When you are finished reading from an input stream, you should close it to avoid a resource leak.
                      Example:
                      scan.close();

        In Java, the Scanner class is widely used to read input, but each language has its own mechanism for handling
        IO (input and output).
         */
    }
}
