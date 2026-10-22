// Q. Calculate Batting Average.
package com.taqi;
import java.util.Scanner;

public class BattingAvg
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter runs : ");
        int runs=in.nextInt();
        System.out.print("Enter dismissals : ");
        int dismissals=in.nextInt();
        float avg=(float)runs/dismissals;
        System.out.print("Batting Average : "+avg);
    }
}
