//LEETCODE-1470:https://leetcode.com/problems/shuffle-the-array/description/
package com.taqi;
import java.util.Arrays;
public class ShuffleArray_lc_1470
{
    public static void main(String[] args)
    {
        int[] nums={2,5,1,3,4,7};
        int n= nums.length/2;
        System.out.print(Arrays.toString(shuffleArray(nums,n)));
    }
    //Time Complexity:O(n),Space Complexity:O(1).
    static int[] shuffleArray(int[] nums, int n)
    {
        int[] arr = new int[2*n];
        for(int i=0;i<n;i++)
        {
            arr[2*i]=nums[i];//Even indices
            arr[2*i+1]=nums[i+n];//Odd inices
        }
        return arr;
    }
}
