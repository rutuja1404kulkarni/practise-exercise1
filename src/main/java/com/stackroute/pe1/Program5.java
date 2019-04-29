//5. Write a program that reads an unspecified number of integer arguments using Scanner Class
//and adds them together. The program should display total of the given input number and should
//only consider integer value.The program should display an error message if there are any non
//integer values

package Java_Exercise;

import java.util.Scanner;

public class Program5 {
    public void addition()
    {
        int number;
        int sum=0;
        System.out.println("Enter how many numbers you want to add");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();

        int arr[]=new int[number];
        System.out.println("Enter the numbers");
        for (int i=0; i<=arr.length-1; i++)
        {
            arr[i]=scanner.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Addition is" +sum);
    }

    public static void main(String[] args) {
        Program5 program5=new Program5();
        program5.addition();
    }
}
