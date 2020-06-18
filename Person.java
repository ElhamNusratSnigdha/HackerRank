import java.util.Scanner;
public class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }
}
class Student extends Person{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    public int[] getTestScores(){
        return this.testScores;
    }
    public void setTestScores(int[] z){
        this.testScores=z;
    }
    public Student(String firstName,String lastName,int id,int[] a){
        super(firstName,lastName,id);
        setTestScores(a);
        getTestScores();
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate(){
        int total=0;
        for(int i=0;i<testScores.length;i++){
            total = total+testScores[i];
        }
        total = total/testScores.length;

        if(total>=90&&total<=100){
            return 'O';
        }else if(total>=80&&total<90){
            return 'E';
        }else if(total>=70&&total<80){
            return 'A';
        }else if(total>=55&&total<70){
            return 'P';
        }else if(total>=40&&total<55){
            return 'D';
        }else return 'T';
    }
}
// class soluction{
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String firstName = scan.next();
//        String lastName = scan.next();
//        int id = scan.nextInt();
//        int numScores = scan.nextInt();
//        int[] testScores = new int[numScores];
//        for(int i = 0; i < numScores; i++){
//            testScores[i] = scan.nextInt();
//        }
//        scan.close();
//
//        Student s = new Student(firstName, lastName, id, testScores);
//        s.printPerson();
//        System.out.println("Grade: " + s.calculate() );
//    }
//}