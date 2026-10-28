package com.taqi;
import java.util.Scanner;
public class MultiDimension
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        /*
        Syntax:
        datatype[][] variable_name=new datatype[rows(must)][coloumns];
         */
        int[][] arr1 = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        int[][] arr = new int[3][3];
        //Input
        System.out.print("Enter the elements : ");
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                arr[row][col]=in.nextInt();
            }
        }
        //Output
        for(int row=0;row<arr.length;row++)
        {
            for(int col = 0; col< arr[row].length; col++)
            {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}

