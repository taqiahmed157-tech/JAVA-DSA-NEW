//LEETCODE 1673:https://leetcode.com/problems/richest-customer-wealth/
package com.taqi;
public class MaxWealth_lc_1672
{
    public static void main(String[] args)
    {
        int[][] accounts={
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(maxWealth(accounts));
    }
    static int maxWealth(int[][] acc)
    {
        int max=0;
        for(int row=0;row<acc.length;row++)
        {
            int sum=0;
            for(int col=0;col<acc[row].length;col++)
            {
                sum=sum+acc[row][col];
            }
            if(sum>max)
                max=sum;
        }
        return max;
    }
}
