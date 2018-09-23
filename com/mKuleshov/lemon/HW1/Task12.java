package com.mKuleshov.lemon.HW1;

import java.util.Scanner;

public class Task12 {
    //Пользователь вводит задает расстояние до места назначения (N) и время, за которое нужно доехать (T).
    // Вычислить скорость (км/ч), с которой нужно ехать.
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter distance(km): ");
        double s = scanner1.nextDouble();
        System.out.print("Enter time(hours): ");
        double t = scanner2.nextDouble();
        System.out.println("Speed = "+(s/t)+" km/hours");


    }

}
