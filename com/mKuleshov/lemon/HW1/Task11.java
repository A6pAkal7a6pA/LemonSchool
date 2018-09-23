package com.mKuleshov.lemon.HW1;

import java.util.Scanner;

public class Task11 {
    //Разработайте программу, которая будет выводить таблицу умножения введенного пользователем числа с клавиатуры.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        for (int i=1;i<11;i++){
           int result=n*i;
            System.out.println("Your number: "+n+" * "+i+" = "+(n*i));


        }

    }

}
