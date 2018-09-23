package com.mKuleshov.lemon.HW1;

public class Task9 {
    //Сделайте программу, которая будет проверять является ли число типа double целым.

    public static void main(String[] args) {
        double n = 10.09;
        if (n%2==0){
            System.out.println("Число "+n+" типа double - целое!");
        }else System.out.println("Число "+n+" типа double -  не целое!");
    }
}
