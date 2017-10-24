//Guess4 - 5 guesses only
//CSIS 1400 in class

import java.util.Random;

import java.util.Scanner;

public class Guess4
{
   public static void main(String[] args)
   {
      //declare variables
      Scanner keyBd = new Scanner(System.in);
      int myGuess, //player guess
         numberToGuess, // random number to guess
         count; //guesses used
      
      //Random import
      Random rNum = new Random();
         
      //show intro message
      System.out.println("\nWelcome to Guess-My-Number\nA GAME of CHANCE and SKILL!");
      System.out.println("You have 5 guesses - Good Luck!");
      
      //pick a random number between 1 and 25
      numberToGuess = 1 + rNum.nextInt(25);
      
      for (count = 1; count <= 5; count++)
      {
         //get a number from the user
         System.out.print("\nEnter a number between 1 and 25: ");
         myGuess = keyBd.nextInt();
         
         //good or bad guess
         if (myGuess < numberToGuess)
         {
            //guess too low
            System.out.printf("Your guess [ %d ] was too low...\n", myGuess);
         }
         else if (myGuess > numberToGuess)
         {
            //guess too high
            System.out.printf("Your guess [ %d ] was too high...\n", myGuess);
         }
         else
         {
            //good guess
            System.out.printf("%nCongratulations!%nYou guessed [ %d ] in %d %s",
               numberToGuess, count, (count > 1) ? "tries." : "try.");
            break;//out of for loop
         }//end if else
      }//end of for loop
      
      if (count > 5)
      {
         //too many guesses
         System.out.printf("%nYou had your %d tries.%n", count - 1);
      }// end if
      
      System.out.println();
   }//end of main
}//end of class