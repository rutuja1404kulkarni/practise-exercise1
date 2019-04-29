//Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 -
//100) User should guess until the the target number is guessed correctly.
//Print separate messages for the following:
//a. Number guessed is more than original number
//b. Number guessed is less than original number
//c. Number guessed matches the original number

package Java_Exercise;

import java.util.Scanner;


public class Program8 {

    public void numberGuess()
    {
        int guess_number=30;

        while (true)
        {
            System.out.println("Guess the number between 1-100");
            Scanner scanner=new Scanner(System.in);
            int number=scanner.nextInt();

            if (guess_number==number)
            {
                System.out.println("Your guess is Right");
                break;
            }

            else if (guess_number>number)
            {
                System.out.println("Guess number is greater");
            }
            else
            {
                System.out.println("Guess number is smaller");
            }

        }

    }

    public static void main(String[] args) {
        Program8 program8=new Program8();
        program8.numberGuess();
    }

}
