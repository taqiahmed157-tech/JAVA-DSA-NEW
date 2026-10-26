package com.taqi;
import java.util.Scanner;
public class Grades
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks : ");
        int marks=in.nextInt();
        System.out.println(grade(marks));
    }
    static String grade(int marks)
    {
        if(marks>90 && marks<=100)
            return "AA";
        else if(marks>80 && marks<=90)
            return "AB";
        else if(marks>70 && marks<=80)
            return "BB";
        else if(marks>60 && marks<=70)
            return "BC";
        else if(marks>50 && marks<=60)
            return "CD";
        else if(marks>40 && marks<=50)
            return "DD";
        else return "Fail!!";
    }
}
