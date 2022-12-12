package com.driver;

public class Main {
public static class Product{
    public int product(int x, int y) {
      return 0;
    }
    public int product(int x, int y, int z) {
        return 0;
    }
    public double product(double x, double y) {
        return 0.0;
    }

}
    public static void main(String[] args){
    Product obj=new Product();
    obj.product(1,2);
    obj.product(1,2,3);
    obj.product(1.0,2.0);

}
}