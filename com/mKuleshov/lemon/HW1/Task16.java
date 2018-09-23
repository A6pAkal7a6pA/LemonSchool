package com.mKuleshov.lemon.HW1;

import java.util.Scanner;

public class Task16 {
    //Дано значение температуры в градусах Цельсия.
    // Вывести температуру  в градусах Фаренгейта.
    //*9/5 и прибавить 32

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Введите температуру в градусах цельсия: ");
        double temperatureC = scanner.nextInt();
        double temperatureF = temperatureC*1.8+32;
        System.out.println(temperatureC+" в цельсиях = "+temperatureF+" в Фарингейтах");

    }

}
