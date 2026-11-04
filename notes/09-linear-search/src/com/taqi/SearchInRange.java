package com.taqi;
import java.util.Scanner;
public class SearchInRange
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements in arrary : ");
        int n=in.nextInt();
        System.out.print("\nEnter "+n+ " elements : ");
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print("\nEnter starting index : ");
        int start=in.nextInt();
        System.out.print("\nEnter terminating index : ");
        int end = in.nextInt();
        System.out.print("\nEnter target element : ");
        int target = in.nextInt();
        searchinrange(arr,start,end,target);
    }
    static boolean searchinrange(int[] arr,int start, int end,int target)
    {
        if(arr.length==0)
            return false;
        for(int i=start;i<=end;i++)
        {
            if(arr[i]==target) return true;
        }
        return false;
    }
}
