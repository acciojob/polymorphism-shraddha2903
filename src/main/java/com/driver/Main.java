package com.driver;

public class Main {
     static class product{

        public int product(int x,int y)
        {
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return (double)x*y;
        }

    }
    public static void main(String args[])
    {
        product p = new product();
        System.out.println(p.product(2,5));
        System.out.println(p.product(2,4,3));
        System.out.println(p.product(1.2,3.5));

    }


}