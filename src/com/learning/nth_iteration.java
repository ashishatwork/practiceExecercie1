package com.learning;

import java.util.Scanner;
import java.lang.*;
public class nth_iteration
{
    public static void iter()
    {
        Scanner in = new Scanner(System.in);
        int term=0;
        System.out.println("Enter the number :");
        int num = in.nextInt();
        for (int n = 1; n<= sum_n(num); n++)
        {
            term= (int) Math.ceil((Math.sqrt(1+8*n) -1)/2);
            System.out.print(term +" ");
        }
    }

    public static int sum_n(int number)
    {
        return (number*(number+1))/2;
    }
}
