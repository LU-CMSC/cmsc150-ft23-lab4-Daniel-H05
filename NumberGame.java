import java.util.Scanner;
import java.util.Random;


public class NumberGame {   

    public static void runMy() {

        int numberGuess;
        Scanner in = new Scanner(System.in);

        Random random = new Random();
        int number = random.nextInt(10) + 1;


        System.out.println("Im thinking of a number between 1 and 10.");
        System.out.println("Can you guess what it is?");
        System.out.print("Type your number: ");
        numberGuess = in.nextInt();

        System.out.println("        "); //space

        System.out.println("Your number is: " + numberGuess);
        System.out.println("My number is: " + number);

        if ( numberGuess > number ) {
            System.out.println("Too high!");
        } else {
            System.out.println("Too low!");
        }
        
        if ( numberGuess == number ) {
            System.out.println("You guessed right!");
        } else {
            System.out.println("Sorry try again.");
        }

        System.out.println("   ");

    }
    public static void main(String[] args) {

        runMy();
        runMy();
        runMy();



        /*
        int numberGuess;
        Scanner in = new Scanner(System.in);

        Random random = new Random();
        int number = random.nextInt(100) + 1;


        System.out.println("Im thinking of a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        System.out.print("Type your number: ");
        numberGuess = in.nextInt();

        System.out.println("        "); //div

        System.out.println("Your number is: " + numberGuess);
        System.out.println("My number is: " + number);

        if ( numberGuess == number ) {
            System.out.println("You guessed right!");
        } else {
            System.out.println("Sorry try again!");
        }
        */



    }
}