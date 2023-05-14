package com.driver;


public class Main {

    public static void main(String args[])
    {
        Product p = new Product();
        System.out.println(p.product(2,5));
        System.out.println(p.product(2,4,3));
        System.out.println(p.product(1.00,3.00));

    }


}