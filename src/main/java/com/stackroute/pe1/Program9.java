//Write a program to reverse any string without using String Buffer.


package Java_Exercise;

import java.util.Scanner;

public class Program9 {
    public void reverse()
    {
        String original_string="",reverse_string="";
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the string");
        original_string=scanner.nextLine();

        int length=original_string.length();

        for (int i=length-1; i>=0; i--)
        {
            reverse_string=reverse_string+original_string.charAt(i);
        }

        System.out.println("Reverse String is " +reverse_string);
    }

    public static void main(String[] args) {
        Program9 program9=new Program9();
        program9.reverse();
    }
}
