//Write a program which accepts a number as input from user and perform the following:
//a. sort the number in non-increasing order
//b. after sorting sum all the even numbers, the sum should be greater than 15 .
//c. if sum is more than 15,then print output as true or false.

package Java_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Program7 {
    public void arraySort()
    {
        int n,sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array size");
        n=scanner.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the numbers");
        for (int i=0; i<=arr.length-1; i++)
        {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < ( n - 1 ); i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Descending order of numbers");
        for (int i=0; i < n ; i++)
        {
            System.out.println(arr[i]);
        }
        for (int i=0;i<n;i++)
        {
            if (arr[i] %2== 0)
            {
                sum=sum+arr[i];
            }
        }
        System.out.println("Sum = " +sum);

        if (sum>15)
        {
            System.out.println("True");
        }
        else System.out.println("false");
    }

    public static void main(String[] args) {
        Program7 program7=new Program7();
        program7.arraySort();
    }

}
