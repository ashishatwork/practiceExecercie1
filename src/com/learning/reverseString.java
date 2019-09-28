package com.learning;
import java.util.Scanner;

public class reverseString
{
    public static void rev()
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter string :");
        String str=inp.nextLine();
        char[] strCopy = str.toCharArray();

        for (int i = strCopy.length-1; i>=0; i--)
            System.out.print(strCopy[i]);

    }
}
