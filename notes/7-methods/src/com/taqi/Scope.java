package com.taqi;

public class Scope
{
    public static void main(String[] args)
    {
        int a=10;
        int b=10;
        //System.out.println(num);Error because it is present in another block.
        // Block scoping(similarly for "loop scoping"
        {
            // int a=10;// Already initialized outside the block in the same method, hence you can't initialize again.
            a=10;// This is valid and you can change the value
            int c=30;// it is also correct but it cannot be accessed out of this block
            System.out.println(c);// This is valid
        }
        // System.out.println(c);// This is not valid as it is defined in different block(c)
    }
    static void abc()
    {
        int num=67;// This is accessible in this function only.
        System.out.println(num);
    }

}