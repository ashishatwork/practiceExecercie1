package com.learning;

import java.util.Scanner;

public class StackRoute
{
    public static void stroute()
    {
        Scanner in= new Scanner(System.in);
        System.out.print("Input1 (String) :");
        String str=in.nextLine();
        System.out.print("\nInput2 (Number):");
        int n=in.nextInt();
        int index=str.length()-n;
        String substr=str.substring(index);
        System.out.print(str);

        for(int i=0;i<n;i++)
            System.out.print(substr);

    }
}
