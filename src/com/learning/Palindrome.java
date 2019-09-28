package com.learning;

import java.util.Scanner;

public class Palindrome
{
    public static void palin()
    {
        long rev=0; int sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        long num = in.nextLong();

        rev=reverse(num);
        if(rev!=num)
        {
            System.out.println(num+ " is not palindrome");
        }
        else
            {
                int digit=0;
                while(rev>0)
                {
                    digit=(int)rev%10;
                    rev=rev/10;
                    if(digit%2==0)
                    {
                        sum=sum+digit;
                    }
                }
                if(sum>25)
                    System.out.println(num+" is palindrome and the sum of even numbers is greater than 25");
                else
                    System.out.println(num+" is palindrome and the sum of even numbers is less than 25");

            }
    }

    public static long reverse(long n)
    {
        long r=0;
        while(n>0)
        {
            r= r*10 +(n%10);
            n=n/10;
        }
        return r;
    }
}
