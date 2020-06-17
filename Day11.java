public class Day11 {
    public static void main(String[] args) {

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
