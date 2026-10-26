package com.taqi;
import java.util.Arrays;
public class ChangeValue
{
    public static void main()
    {
        // Create an array.
        int[] arr={1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums)
    {
        nums[0]=99;// if you make change to the object via this reference varibable, same object will be changed.
    }

}
