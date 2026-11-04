package com.taqi;
import java.util.Scanner;
public class Min
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements in array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        if(arr.length==0)
        {
            System.out.println("Arrray is empty!!");
            return;
        }
        System.out.print("Enter "+n+" elements : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print("The minimum number in array : "+min(arr));
    }
    static int min(int[] nums)
    {
        int min = nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
                min=nums[i];
        }
        return min;

    }
}
