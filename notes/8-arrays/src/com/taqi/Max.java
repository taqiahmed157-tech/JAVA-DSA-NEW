package com.taqi;
import java.util.Arrays;
import java.util.Scanner;
public class Max
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements of array : ");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements in array : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print("Array : "+Arrays.toString(arr));
        System.out.println("\nMaximum number in array : "+max(arr));
    }
    static int max(int[] arr)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}
