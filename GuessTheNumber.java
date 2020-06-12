import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    int theNumber;
    int max;
    Scanner scan = new Scanner(System.in);
    public GuessTheNumber(){
        Random rand = new Random();
        max = 100;
        theNumber = Math.abs(rand.nextInt())%(max+1);
    }

    public void play() {
        while (true) {
            int move = scan.nextInt();
            if (move > theNumber) {
                System.out.println("Your number is too big");
            } else if (move < theNumber) {
                System.out.println("Your number is too small");
            } else System.out.println("You got it");
        }
    }

    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber();
        System.out.println("Welcome to my game");
        System.out.println("Enter a number to play");
        game.play();
    }
}
