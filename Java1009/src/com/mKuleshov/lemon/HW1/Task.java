package com.mKuleshov.lemon.HW1;

public class Task {
    // В переменных q и w хранятся два натуральных числа.
    // Создайте программу, выводящую на экран результат деления q на w с остатком.
    // Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
    public static void main(String[] args) {
        int q=21;
        int v=8;
        double result1, result2;
        result1 = q/v;
        result2 = q%v;
        System.out.println(q+" / "+v+" = "+q/v+" ostatok = "+q%v);
    }
}
