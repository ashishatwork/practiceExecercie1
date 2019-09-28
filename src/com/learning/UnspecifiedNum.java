package com.learning;

import java.util.Scanner;

public class UnspecifiedNum
{
    public static void unspec()
    {
        Scanner in=new Scanner(System.in);
        int n=0, sum=0, count=0;
        System.out.println("Enter your input in single line separated by spaces");
        String input = in.nextLine();
        String[] numbers = input.split(" ");
        n=numbers.length;
        int[] num=new int[n];
        for(int i=0;i<n;i++)
        {
            try
            {
                num[i]=Integer.parseInt(numbers[i]);
                sum=sum+num[i];
            }
            catch(NumberFormatException e)
            {
                count++;
            }
        }
        System.out.println("Sum of integers only is :"+sum);
        if(count>0)
            System.out.println(count +" Non-integer/s Found");
    }
}
