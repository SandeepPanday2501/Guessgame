// Java program for the above approach
import java.util.Scanner;

public class Main {
    public static void
    guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(10 * Math.random());
        // Number of rounds
        int R = 5;
        int i, guess;
        System.out.println("Guess a number between 1 to 10" + "*****" + "Choose well cause you have only 5 lives to get the correct one 0_0" + "*****");

        for (i = 0; i < R; i++) {

            System.out.println("Guess the number:");
            guess = sc.nextInt();

            // when the guess is correct
            if (number == guess) {
                System.out.println("Congratulations!" + " You have  guessed the number :)");
                break;
            }
            else if (number > guess && i != R - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess && i != R - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }


        
        if (i == R) {
            System.out.println( "Sorry You Have Used All Of Yours Lives :(" );

            System.out.println("The Correct Answer was"  + number);
        }
    }
    public static void
    main(String arg[])
    {
        guessingNumberGame();
    }
}
