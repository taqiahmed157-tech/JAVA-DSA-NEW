package com.taqi;
import java.util.Arrays;
import java.util.Scanner;
public class PassingInFunctions
{
    public static void main(String[] args)
    {
        int[] arr={3,4,58,29};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums)
    {
        nums[0]=23;
    }
}
