package com.driver;

public class Main {
public static class Product{
    public int product(int x, int y) {
      return x*y;
    }
    public int product(int x, int y, int z) {
        return x*y*z;
    }
    public double product(double x, double y) {
        return x*y;
    }

}
    public static void main(String[] args){
    Product obj=new Product();
    obj.product(1,2);
    obj.product(1,2,3);
    obj.product(1.0,2.0);

}
}