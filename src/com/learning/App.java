package com.learning;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int program=0;
        Scanner sc=new Scanner(System.in);
        boolean enter=true;
        do{
            System.out.println("******MENU******");
            System.out.println("\nEnter: ");
            System.out.println("1. Character identifier Program");
            System.out.println("2. Non Decreasing Order Program");
            System.out.println("3. nth iteration Program");
            System.out.println("4. Palindrome Program");
            System.out.println("5.Reverse String  Program");
            System.out.println("6. Stackroute Program");
            System.out.println("7.Target number Program");
            System.out.println("8.Tom and Jerry Program");
            System.out.println("9.Vowel Constant Program");
            System.out.println("10. Unspecified Number Program");
            System.out.println("0 to Exit");
            program=sc.nextInt();

            switch(program)
            {
                case 0:
                    enter=false;
                    break;
                case 1:
                    charIdentifier identify=new charIdentifier();
                    identify.Identifier();
                    break;
                case 2:
                    NonIncreasingOrder nonin=new NonIncreasingOrder();
                    nonin.nonIncorder();
                    break;
                case 3:
                    nth_iteration itr=new nth_iteration();
                    itr.iter();
                    break;
                case 4:
                    Palindrome pal=new Palindrome();
                    pal.palin();
                    break;
                case 5:
                    reverseString reverse=new reverseString();
                    reverse.rev();
                    break;
                case 6:
                    StackRoute st=new StackRoute();
                    st.stroute();
                    break;
                case 7:
                    target_num num=new target_num();
                    num.target();
                    break;
                case 8:
                    Tom t=new Tom();
                    t.tomNJerry();
                    break;
                case 9:
                    vowel_consonant v=new vowel_consonant();
                    v.vowcon();
                    break;
                case 10:
                    UnspecifiedNum un=new UnspecifiedNum();
                    un.unspec();
                    break;
                default:
                    enter=false;
                    break;
            }


        }while(enter);
    }
}
