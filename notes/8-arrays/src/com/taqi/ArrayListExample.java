package com.taqi;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListExample
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Syntax:-
        ArrayList<Integer> list = new ArrayList<>(10);
        //Input
        System.out.print("Enter the elements of array list : ");
        for(int i=0;i<5;i++)
        {
            list.add(in.nextInt());
        }
        //Get item at any index
        for(int i=0;i<5;i++)
        {
            list.get(i);//Add index here, list[index] does not work here.
        }
        //Print
        System.out.println(list);
    }
}
