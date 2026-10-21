package com.taqi;

public class Conditionals
{
    public static void main()
    {
        /* Syntax of if-else statement:
        if(boolean expression T or F)
        {
            //Body
        }
        else
        {
            Do this
        }
         */
        /*Q: Given salary is 25400 add two thousand if salary is greater that 10000
        else add 1000 and print it.
         */
        int salary = 25400;
        if(salary>10000)
        {
            salary=salary+2000;// 27400

        }
        else
        {
            salary=salary+1000;
        }
        System.out.println(salary);

    }
}
