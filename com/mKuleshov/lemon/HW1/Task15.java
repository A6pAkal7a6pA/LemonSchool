package com.mKuleshov.lemon.HW1;

public class Task15 {
    //Даны катеты прямоугольного треугольника.
    // Найдите площадь, периметр и гипотенузу треугольника.
    public static void main(String[] args) {
        double c1 = 7;
        double c2 = 8;
        double s = c1*c2/2;
        double c3 = Math.sqrt((c1*c1)+(c2*c2));
        double p = c1 + c2 + c3;
        System.out.println("Area= "+s+"; hypotenuse= "+c3+"; perimetr= "+p);
    }
}
