package com.driver;

public class Main {
    public static class product{

        public int product(int x,int y)
        {
            return x*y;
        }

    }
    public static void main(String args[])
    {
        product p= new product();
        System.out.println(p.product(2,5));

    }


}