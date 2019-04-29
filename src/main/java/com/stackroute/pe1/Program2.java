
//Write a program which accepts an integer number as input from the user and perform the
//following conditional checks:
//a. Print Tom if number is odd and exists between 20 to 30
//b. Print Jerry, if number is even and exists between 20 and 30

package Java_Exercise;

import java.util.Scanner;

public class Program2 {
    public void oddEven()
    {
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        number=scanner.nextInt();
        if(number>=20 && number<30)
        {
            if(number%2==0)
            {
                System.out.println("Jerry");
            }
            else
            {
                System.out.println("Tom");
            }
        }
        else
        {
            System.out.println("Please enter the valid number");
        }
    }

    public static void main(String[] args) {
        Program2 program2 =new Program2();
        program2.oddEven();
    }


}
