package com.mKuleshov.lemon.HW1;

public class Task4 {
    //В переменной n хранится натуральное трёхзначное число.
    // Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.

    public static void main(String[] args) {
        int n = 109;

        int one=n/100;
        int two=n/10%10;
        int three=n%10;
        System.out.println("Sum: "+one+" + "+two+" + "+three+" = "+(one+two+three));

    }
}
