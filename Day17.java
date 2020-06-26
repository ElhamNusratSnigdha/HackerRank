import java.util.*;
import java.io.*;
//Write your code here
class Calculator{
    public static int power(int n,int p)throws negativeException{
        if(n<0||p<0){
            throw new negativeException();
        }
        if(p==0){
            return 1;
        }else{
            return n*power(n,p-1);
        }
    }
}
class negativeException extends Exception{
    public String getMessage(){
        return "n and p should be non-negative";
    }
}
public class Day17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
/* Extra Materials:
        #Propagating Exceptions
                  : If an exception is not caught by the method that threw it, the program's control is transferred back
                    (propagated) to the calling method (i.e.: whatever called the method that threw the exception). This
                    can be good if you have designed your program to handle exceptions at a high level, but bad if you
                    never write code to catch the exception in the calling methods that the exception is being propagated
                    to. The example method below throws an exception of type Exception, which propagates back to the
                    calling method (main), where a catch block catches it and prints a message:

                    class PropagatedException {
                        void example() throws Exception{
                            throw new Exception("This exception will always be thrown.");
                        }

                        public static void main(String[] args) {
                            PropagatedException p = new PropagatedException();
                            try{
                                p.example();
                            }
                            catch(Exception e){
                                System.err.println( e.getClass().getSimpleName() + ": " + e.getMessage() );
                            }
                        }
                    }

                    The above code throws a java.lang.Exception and prints:
                    Exception: This exception will always be thrown.
 */
