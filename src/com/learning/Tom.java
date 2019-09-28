package com.learning;
import java.util.Scanner;
public class Tom
{
    public static void tomNJerry()
    {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the number :");
        int num=in.nextInt();

        if((num%2!=0) && (num>20 && num<30))
            System.out.println("Tom");
        else if ((num%2==0) && (num>20 && num<30))
            System.out.println("Jerry");
        else
            System.out.println("Number is out of range of 20-30");
    }

}
