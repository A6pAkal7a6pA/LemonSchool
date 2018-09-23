package com.mKuleshov.lemon.HW1;

import java.util.Scanner;

public class Task8 {
    //Напишите программу которая определяет число четное или не четное
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        if (num%2==0){
            System.out.println("Number "+num+" even");
        }else System.out.println("Number "+num+" odd");
    }
}
