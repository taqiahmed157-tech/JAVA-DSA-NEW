package com.taqi;

public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] nums={2,34,523,34,99,98,24};
        int target=99;
        int ans =linear(nums,target);
        System.out.println(ans);
    }
    //Search in array: return the index if item found
    //else return -1.
    static int linear(int[] arr,int target)
    {
        if(arr.length==0)
            return -1;
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]==target)
                return index;

        }
        return -1;
    }
}
