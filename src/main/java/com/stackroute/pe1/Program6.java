//Write a program that takes a character from the user as input and determines whether the
//character entered is a capital letter, a small case letter, a digit or a special symbol and display
//appropriately.

package Java_Exercise;

import java.util.Scanner;

public class Program6 {
    public void findChar( char input_char)
    {
        if ((input_char >= 65 && input_char <= 90)|| (input_char >= 97 && input_char <= 122))
            System.out.println ( " Alphabet ");
        else if (input_char >= 48 && input_char <= 57)
            System.out.println(" Digit ");
        else
            System.out.println ( " Special Character ");
    }

    public static void main(String[] args) {
        char input_char='a';
        Program6 program6=new Program6();
        program6.findChar(input_char);

    }
}
