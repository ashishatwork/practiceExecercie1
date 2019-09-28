package com.learning;

import java.util.Scanner;

public class vowel_consonant
{
    public static void vowcon()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter string :");
        String str=in.nextLine();
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                System.out.print("Vowel ");
            }
            else if((ch >= 'a'&& ch <= 'z'))
            {
                System.out.print("Consonant ");
            }
            else
                System.out.print("Not a Letter");
        }

    }
}
