package com.taqi;

import java.util.Scanner;

public class Loops
{
    public static void main()
    {
        /* Syntax of for loop:
        for(intialization;condition;increment/decrement);
        {
            // Body
        }
         */

        //Q:Print numbers from 1 to 5".
        System.out.print("Here are required five terms : ");
        for(int i=1;i<=5;i++)
        {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms to print it : ");
        int n = input.nextInt();

        for(int i = 1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
        /*Syntax of While loop:-
        while(condition)
        {
            //body
        }
         */
        //Q.Print numbers from 1 to 5.
        int j=1;
        System.out.print("\nNumbers from 1 to 5 using while loop :");
        while(j<6)
        {
            System.out.print(j+" ");
            j++;
        }
        /* Syntax of do while loop:-
        do
        {

        }while(condition);
         */
        System.out.print("\nUsing do while loop :");
        int k=1;
        do {
            System.out.print(k+" ");
            k++;
        }while(k<=5);



    }
}
