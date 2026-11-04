//LEETCODE 1295:https://leetcode.com/search/?q=1295
package com.taqi;
public class EvenDigits_lc_1295
{
    public static void main(String[] args)
    {
        int[] arr={12,345,2,6,7896};
        System.out.println(evenDigits(arr));
    }
    static int evenDigits(int[] nums)
    {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            int temp=nums[i];
            while(temp>0)
            {
                 temp=temp/10;
                 count++;
            }
            if(count%2==0)
                ans++;

        }
        return ans;
    }
}
