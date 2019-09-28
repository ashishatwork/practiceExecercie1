package com.learning;
import java.util.Scanner;

public class charIdentifier
{
    public static void Identifier()
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Character to be identified");
        char c = inp.next().charAt(0);
        int asc=c;
        if(asc>=65 && asc<=90)
            System.out.println("Capital Letter");
        else if(asc>=97 &&  asc<=122)
            System.out.println("Small Letter");
        else if(asc>=48 && asc<=57)
            System.out.println("Digit");
        else
            System.out.println("Special Symbol");
    }
}
