import java.util.Scanner;
public class Day11 {
    private static final Scanner scanner = new Scanner(System.in);
    public static int getHourglassSum(int[][] matrix,int row,int column){
        int sum=0;
        sum += matrix[row-1][column-1];
        sum += matrix[row-1][column];
        sum += matrix[row-1][column+1];
        sum += matrix[row][column];
        sum += matrix[row+1][column-1];
        sum += matrix[row+1][column];
        sum += matrix[row+1][column+1];
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int currentHourGlassSum=0;
        int maxHourglassSum=-63;
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                currentHourGlassSum=getHourglassSum(arr,i,j);
                if(currentHourGlassSum>maxHourglassSum){
                    maxHourglassSum=currentHourGlassSum;
                }
            }
        }
        System.out.println(maxHourglassSum);
        
        /* Extra Materials:
        #2D Arrays : known as multidimensional arrays, they are very similar to the regular 1D Array data structure.
                     int rowSize = 2;
                     int colSize = 4;
                     int[][] myArray = new int[rowSize][colSize];

                     This creates a (2x4) matrix where each element,(i,j), can be graphically represented as follows:
                     (0, 0) (0, 1) (0, 2) (0, 3)
                     (1, 0) (1, 1) (1, 2) (1, 3)

                     To fill the array's cells with values, you can use a nested loop. The outer loop represents the
                     matrix's rows and uses "i" as its variable, and the inner loop represents the matrix's columns and
                     uses "j" as its variable. The code below assigns the value of "count" to each element in the 2D
                     array we declared previously:
                     int count = 0;
                     for(int i = 0; i < rowSize; i++) {
                        for(int j = 0; j < colSize; j++, count++) {
                            myArray[i][j] = count;
                        }
                     }

                    If we print the contents of each row:
                    for(int i = 0; i < rowSize; i++) {
                        // print the row of space-separated values
                        for(int j = 0; j < colSize; j++) {
                            System.out.print(myArray[i][j] + " ");
                        }
                        // end of row is reached, print newline
                        System.out.println();
                    }
         */
    }
}
