package com.learning;
import java.util.Scanner;
import java.util.Random;

public class target_num
{
    public static void target()
    {
        Scanner in=new Scanner(System.in);
        Random ran = new Random();
        int originalNumber, enteredNumber;
        int upperLimit = 50;
        originalNumber = ran.nextInt(upperLimit)+1;

        System.out.println("Enter number in the range of 1-50 :");
        enteredNumber=in.nextInt();
        while(enteredNumber!=originalNumber)
        {
            if(enteredNumber>originalNumber)
            {
                System.out.println("Number guessed is more than the original number");
                System.out.println("Enter again");
                enteredNumber=in.nextInt();
            }
            else
            {
                System.out.println("Number guessed is less than the original number");
                System.out.println("Enter again");
                enteredNumber=in.nextInt();
            }
        }
        System.out.println("Number guessed matches the original number");

    }
}
