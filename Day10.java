import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Day10 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String bin = Integer.toBinaryString(n);
        int one=0;
        int[] current= new int[10];
        int j=0;
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                one++;
            }else{
                one=0;
            }

            if(current[j]<one){
                current[j]=one;
            }
        }
        int max=0;
        for (int i=0;i<current.length;i++){
            if (current[i]>max){
                max=current[i];
            }
        }
        System.out.println(max);
        scanner.close();
        /* Extra Materials:
        #Radix (Base)     : The number of digits that can be used to represent a number in a positional number system is "Base".
                            The decimal number system (base-10) has 10 digits (0,1,2,3,4,5,6,7,8,9);
                            the binary (base-2) number system has 2 digits (0,1).
        #Binary to Decimal Conversion :
        #Decimal to Binary Conversion :

                            while(n > 0):
                                remainder = n%2;
                                n = n/2;
                                Insert remainder to front of a list or push onto a stack

                            Print list or stack

        for more : https://www.hackerrank.com/challenges/30-binary-numbers/tutorial
        https://www.tutorialspoint.com/java-program-to-convert-from-decimal-to-binary#:~:text=To%20convert%20decimal%20to%20binary,unsigned%20integer%20in%20base%202.

         */
    }
}
