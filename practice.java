import java.util.*;
public class practice {

    /*************************Beginner Task7*************************/
    //instance variables below
    int maxSpeed = 100;
    int minSpeed =0;
    double weight = 4079;
    boolean isItOn = false;
    char condition = 'A';
    String carName = "Suzy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4; //mass per gallon(mpg)

    int numberOfPeopleInCar = 1;

    public practice(){

    }

    public practice(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isItOn = customIsTheCarOn;
    }

    public void printVariables(){
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isItOn);
        System.out.println(condition);
        System.out.println(carName);
        System.out.println(numberOfPeopleInCar);
    }

    public void wreckCar(){
        condition = 'C';
    }

    public void upgradeSpeed(){
        //these are primitive data type/independent
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 50;
        condition = 'A';
    }

    public void getIn(){
        numberOfPeopleInCar++;
        //numberOfPeopleInCar = numberOfPeopleInCar+1;
    }

    public void getOut(){
        numberOfPeopleInCar--;
        //numberOfPeopleInCar = numberOfPeopleInCar-1;
    }

    public double howManyMilesTillOutOfGas(){
        return currentFuel*mpg;
    }

    public double maxMilesPerFillUp(){
        return maxFuel/mpg;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        /*************************Beginner Task7*************************/

        System.out.println("Task-7 [Objects and Methods]");
        practice familyCar = new practice(); //[creating an object of practice]
        System.out.println("Family Car's information :");
        familyCar.printVariables();
        /*reference data type/dependent aliceCar
        More examples of Referenced Types: Arrays, Queues, Linked lists, Stacks
        */
        practice aliceCar = familyCar;
        familyCar.wreckCar();
        System.out.println("Alice Car's information: ");
        aliceCar.printVariables();
        //primitive data type minSpeed & maxSpeed
        aliceCar.upgradeSpeed();
        System.out.println("Upgrated Alice Car's information: ");
        aliceCar.printVariables();

        System.out.println("Custom Car: ");
        practice birthdayPresent = new practice(500,5000.545,true);
        birthdayPresent.printVariables();

        System.out.println("Christmas Present:");
        practice christmasPresent = new practice(550,2000,false);
        christmasPresent.printVariables();

        System.out.println();
        System.out.println("Final Custom Car:");
        practice finalCar = new practice();
        System.out.println();
        System.out.println("Part1");
        finalCar.printVariables();
        finalCar.getIn();
        finalCar.getIn();
        finalCar.getIn();
        System.out.println("Miles left: " + finalCar.howManyMilesTillOutOfGas());
        System.out.println("Max miles: "+finalCar.maxMilesPerFillUp());
        System.out.println();
        System.out.println("Part2");
        finalCar.printVariables();
        finalCar.getOut();
        finalCar.getOut();
        System.out.println();
        System.out.println("Part3");
        finalCar.printVariables();

        System.out.println();
        /************************Beginner Task1*************************/

        System.out.println("Task-1 [sum of two numbers]");

        System.out.println("Enter an integer: ");
        int num1 = s.nextInt(); // Get first integer
        System.out.println("Enter an integer: ");
        int num2 = s.nextInt(); // Get second integer

        int sum1 = 0;
        // Write the logic to add these integers here
        sum1 = num1+num2;
        // Print the sum
        System.out.println(sum1);

        /*************************Beginner Task2*************************/

        System.out.println("Task-2 [sum of all the numbers in an array]");

        int[] numArray2 = new int[4]; // Define an array of integers of size 4.

        for(int i=0; i<4; i++){
            System.out.println("Enter an integer for array's index number: "+i);
            numArray2[i] = s.nextInt(); // Get the input
        }
        int sum2 = 0;
        // Write the logic to add these integers here:

        for(int i=0;i<4;i++){
            sum2 +=numArray2[i];
        }
        System.out.println(sum2); // Print the sum

        /*************************Beginner Task3*************************/

        System.out.println("Task-3/2.1 [sum of all the numbers in an array]");
        int N;
        System.out.println("Enter array's length: ");
        N = s.nextInt();

        // Define an array of integers of size N.
        int[] numArray3 = new int[N];


        int sum3 = 0;
        for(int i=0; i<N; i++){
            System.out.println("Enter an integer for array's index number: "+i);
            numArray3[i] = s.nextInt(); // Get the input
        }

        // Write the logic to add these numbers here:
        for(int i=0;i<numArray3.length;i++){
            sum3 += numArray3[i];
        }
        // Print the sum
        System.out.println(sum3);

        /*************************Beginner Task4*************************/

        System.out.println("Task-4 [sum of all the numbers^2 in an array]");
        System.out.println("Enter array's length: ");
        N = s.nextInt();

        // Define an array of integers of size N.
        int[] numArray4 = new int[N];


        int sum4 = 0;
        for(int i=0; i<N; i++){
            System.out.println("Enter an integer for array's index number: "+i);
            numArray4[i] = s.nextInt(); // Get the input
        }

        // Write the logic to add these numbers here:
        for(int i=0;i<N;i++){
            sum4 += numArray4[i]*numArray4[i];
        }
        // Print the sum
        System.out.println(sum4);

        /*************************Beginner Task5*************************/

        System.out.println("Task-5 printing all number from L to R");
        // Get L and R from the input
        System.out.println("Enter an integer for L: ");
        int L = s.nextInt();
        System.out.println("Enter an integer for R: ");
        int R = s.nextInt();

        // Write here the logic to print all integers between L and R
        for(int i=L;i<=R;i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        /*************************Beginner Task6*************************/

        System.out.println("Task-6 [array of sum from two arrays]");
        // Reading integer from input
        System.out.println("Enter array's length: ");
        N = s.nextInt();

        int[] numArrayA = new int[N];
        int[] numArrayB = new int[N];
        int[] sumArray = new int[N];

        // Read numArray1
        for(int i=0; i<N; i++) {
            System.out.println("Enter an integer for arrayA's index number: "+i);
            numArrayA[i] = s.nextInt();
        }
        // Read numArray2
        for(int i=0; i<N; i++) {
            System.out.println("Enter an integer for arrayB's index number: "+i);
            numArrayB[i] = s.nextInt();
        }

        // Write your logic here:
        for(int i=0;i<N;i++){
            sumArray[i] = numArrayA[i]+numArrayB[i];
        }
        // Print the sumArray
        for(int i=0; i<N; i++) {
            System.out.print(sumArray[i] + " ");
        }

        System.out.println();

        s.close();
    }
}
