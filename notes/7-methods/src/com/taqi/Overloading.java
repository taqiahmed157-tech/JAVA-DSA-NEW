package com.taqi;

public class Overloading
{
    public static void main(String[] args)
    {
        fun(8);// Go to line 10
        fun("Taqi");// Go to line 14
    }
    static void fun(int a)
    {
        System.out.println(a);
    }
    static void fun(String name)
    {
        System.out.println(name);
    }
}
