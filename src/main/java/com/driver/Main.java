package com.driver;

public class Main {

    public static class Product{

        public int product(int x , int y){
            return 1;
        }

        public int product(int x , int y , int z){
            return 2;
        }

        public double product(double x , double y){
            return 3.0;
        }
    }

    public static void main(String agrs[]){
        Product p = new Product();
        System.out.println(p.product(1,0));
        System.out.println(p.product(1,0,2));
        System.out.println(p.product(1.0 , 2.0));
    }

}