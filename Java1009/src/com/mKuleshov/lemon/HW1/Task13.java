package com.mKuleshov.lemon.HW1;

import java.util.Scanner;

public class Task13 {
    //Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();
        int h = n*24;
        int m = n*1440;
        int s = n*86400;
        System.out.println("In days: "+h+" hours; "+m+" minutes; "+s+" seconds.");

    }
}
