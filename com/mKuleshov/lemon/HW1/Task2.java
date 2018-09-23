package com.mKuleshov.lemon.HW1;

public class Task2 {
    // В переменной n хранится натуральное двузначное число.
    // Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
    public static void main(String[] args) {
        int n = 21;
        int temp;
        temp=n%10;
        System.out.println("n= "+n+" -> "+n/10+" + "+n%10+" = "+((n/10)+(n%10)));

    }
}
