
//Create a program that accepts a word as input and checks for each single character letter in
//the word whether it is a consonant or vowel.
//Condition:
//a. Print an error message if the input is not a letter
//b. If the input having more than one letter, print the required output
//(Vowel or Consonant) for each letter

package Java_Exercise;

import java.util.Scanner;

public class Program3 {

    public void vowels()
    {
        String string="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENter the string");
        string=scanner.nextLine();

        int length=string.length();

        for (int i=0; i<=length-1; i++)
        {
            System.out.print(string.charAt(i));

            if(string.charAt(i)=='a'|| string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u')
                System.out.println("-Vowel " );
            else
                System.out.println("-Consonant ");
        }
    }

    public static void main(String[] args) {
        Program3 program3=new Program3();
        program3.vowels();
    }

}
