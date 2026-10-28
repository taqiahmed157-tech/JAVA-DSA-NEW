package com.taqi;
import java.util.Scanner;
import java.util.Arrays;
public class MaxInRange
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in array : ");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements in array : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print("Enter first index of range : ");
        int first=in.nextInt();
        System.out.print("Enter last index of arange : ");
        int last =in.nextInt();
        System.out.println(max(arr,first,last));
    }
    static int max(int arr[], int start,int end)
    {
        int max=arr[start];
        for(int i=start;i<end;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
