

//****************************************************************
//Program Name: JellyBeanGame.java - SKELETON CODE for STEP 1
//
//Author :  Chiemela Nwoke
//
//Date : 9/27/15
//Description:
//Play a game where the user tries to guess the
//number of jellybeans in a jar.  Can range from 1 to 1000
//
//Uses a do..while loop.
//
//****************************************************************

import java.util.Scanner;
import java.util.Random;

public class JellyBeanGame {
    public static void main(String[] args) {
        int numOfJellyBeans = 0; // Number of jellybeans in jar
        int guess = 0; // The user's guess
        int numOfGuesses = 0;
        String answer = "";

        Random generator = new Random();
        Scanner scan = new Scanner(System.in);

        // randomly generate the number of jellybeans in jar
        numOfJellyBeans = generator.nextInt(1000) + 1;

        System.out
                .println("There are between 1 and 1000 jellybeans in the jar.");
        System.out.println("How many do you think are in the jar?");

        do {
            // prompt user and read in guess
            System.out.print("Enter your quess: ");
            guess = scan.nextInt();
            numOfGuesses++; // increaments the number of guesses

            // if the guess is wrong display message
            if (guess < numOfJellyBeans) {
                System.out.println("Too low! ");
            }

            else if (guess > numOfJellyBeans) {
                System.out.println("Too high! ");
            } else {
                // if the guess is correct display message

                System.out.println("High Five! You got it, after "
                        + numOfGuesses +  "guesses");
                System.out.println("Play again? y or n:");
                answer = scan.nextLine();}

        } while (guess != numOfJellyBeans);

        System.out.println("See you later!");

    }
}


