package com.taqi;

import java.util.Arrays;

public class VarArgs
{
    public static void main(String[] args)
    {
        fun(2,34,3,58,98);;
    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
