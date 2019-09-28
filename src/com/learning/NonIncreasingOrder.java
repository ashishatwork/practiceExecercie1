package com.learning;

import java.util.Scanner;
import java.lang.*;

public class NonIncreasingOrder
{
    public static void nonIncorder()
    {
        Scanner in=new Scanner(System.in);
        int s=0;
        System.out.println("Enter number :");
        String str=in.nextLine();
        int n=str.length();
        int[] num=new int[n];
        for(int i=0;i<n;i++)
        {   char c=str.charAt(i);
            num[i]=Integer.parseInt(String.valueOf(c));
        }
        for (int i=0;i<n;i++)
        {
            for (int j=i + 1; j < n; j++)
            {
                if (num[i] < num[j])
                {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }


        System.out.print("Sorted number in non-increasing order :");
        for(int i=0;i<n;i++)
        {
            System.out.print(num[i]);
        }
        s=sum(num);
        System.out.print("\nSum of even numbers :");
        System.out.println(s);
        if(s>15)
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static int sum(int[] numbers)
    {
        int sum=0;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]%2==0)
                sum=sum+numbers[i];
        }
        return sum;
    }
}
