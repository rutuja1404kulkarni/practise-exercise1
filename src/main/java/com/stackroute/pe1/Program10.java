//10. Write a program for the following condition:
//Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
//repeat n number of times in the output String.

package Java_Exercise;

import java.util.Scanner;

public class Program10 {
    public void printSubstring()
    {
        String str="",subString="";
        int value;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String :");
        str = scanner.next();

        System.out.println("Enter a small number :");
        value = scanner.nextInt();


        int stringlen = str.length();
        int valueRpt = stringlen-value;
        subString = str.substring(valueRpt);
        System.out.print(str);

        for( byte i = 0; i < value ; i++) {
            System.out.print(subString);
        }
    }

    public static void main(String[] args) {
        Program10 program10=new Program10();
        program10.printSubstring();
    }
}
