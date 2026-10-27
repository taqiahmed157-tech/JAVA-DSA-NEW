package com.taqi;
import java.util.Arrays;
import java.util.Scanner;
public class Input
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        //Basic input:
        arr[0]=23;
        arr[1]=45;
        arr[2]=23;
        arr[3]=543;
        arr[4]=3;
        System.out.println(arr[3]);//543
        //for loop input:
        System.out.print("Enter the elements of array : ");
        for(int i=0;i<arr.length;i++)//arr.length calculates the number of elements in array
            arr[i]=in.nextInt();
        //output using for loop:
        System.out.print("Using for loop : ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ " ");
        //output using for each loop:
        System.out.print("\nUsing for each loop : ");
        for(int num : arr)//For every element in array, print the element
            System.out.print(num+" ");//Here num represents element of array
        //System.out.println(arr[5]);//Array out of bound error
        // Printing using Arrays.toString() function
        System.out.print("\nUsing Arrays.toString() : ");
        System.out.println(Arrays.toString(arr));

    }
}
