
//Write a program which accepts a number as input and check whether the given number is
//palindrome or not If it is a palindrome then

package Java_Exercise;

import java.util.Scanner;

public class Program1 {

    public void palindrome() {
       int remainder,temp,sum=0,reverse_num=0;

       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to check");
        int number = scanner.nextInt();

        temp=number;

        while (number>0)
        {
            remainder=number%10;
            reverse_num=(reverse_num*10)+remainder;
            number=number/10;

            if (remainder%2==0)
            {
                sum=sum+remainder;
            }
        }

        if(temp==reverse_num)
        {
            if (sum>25)
            {
                System.out.println("Given number is Palindrome and the sum is " +sum + " less than 25" );
            }
            else{
                System.out.println("Given number is Palindrome and the sum is "  +sum +" greater than 25 ");
            }

        }
        else System.out.println("Given number is not Palindrome");
    }

    public static void main(String[] args) {
        Program1 program1=new Program1();
        program1.palindrome();
    }
}
