package com.mKuleshov.lemon.HW1;

import java.util.Scanner;

public class Task10 {
    //Напишите программу, которая будет просить ввести ваше имя, а потом выведет его на консоль.(*)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name: "+name);
    }
}
