import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Day20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        // Track number of elements swapped during a single array traversal
        int numSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    // swap(a[j], a[j + 1]);
                    numSwaps++;
                }
            }
            // If no elements were swapped during a traversal, array is sorted
            if (numSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in "+numSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
}
/* Extra Materials:
        #Sorting : Sorting is the act of ordering elements. The ability of a program to organize and retrieve data quickly
                   and efficiently is incredibly important in software development. Learning how to effectively sort and
                   retrieve the data you're working with enables you to write better, faster algorithms.

        #Bubble Sort:
                   This is a very simple sorting algorithm. Because it's also very inefficient, Bubble Sort is not practical
                   for real-world use and is generally only discussed in an academic context. The basic theory behind
                   BubbleSort is that you take an array of integers and iterate through it; for each element at some
                   index "i" whose value is greater than the element at the index following it (i.e., index "i+1"), you
                   must swap the two values. The act of swapping these values causes the larger, unsorted values to float
                   to the back (like a bubble) of the data structure until they land in the correct location.

        #Implementation:
                    import java.util.*;
                    class Sorting {
                        private static void printArray(String s, int[] x) {
                            System.out.print(s + " Array: ");
                            for(int i : x){
                                System.out.print(i + " ");
                            }
                            System.out.println();
                        }

                        public static void bubbleSort(int[] x) {
                            printArray("Initial", x);

                            int endPosition = x.length - 1;
                            int swapPosition;

                            while( endPosition > 0 ) {
                                swapPosition = 0;

                                for(int i = 0; i < endPosition; i++) {

                                    if( x[i] > x[i + 1] ){
                                        // Swap elements 'i' and 'i + 1':
                                        int tmp = x[i];
                                        x[i] = x[i + 1];
                                        x[i + 1] = tmp;

                                        swapPosition = i;
                                    } // end if

                                    printArray("Current", x);
                                } // end for

                                endPosition = swapPosition;
                            } // end while

                            printArray("Sorted", x);
                        } // end bubbleSort

                        public static void main(String[] args) {
                            Scanner scan = new Scanner(System.in);
                            int n = scan.nextInt();
                            int[] unsorted = new int[n];
                            for (int i = 0; i < n; i++) {
                                unsorted[i] = scan.nextInt();
                            }
                            scan.close();

                            bubbleSort(unsorted);
                        }
                    }
 */