package lemon.mKuleshov.HW2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter number for cos and sin");
       String s = scanner.nextLine();

       double degree = Double.parseDouble(s);

       double radians = Math.toRadians(degree);
       String rString = String.format("%.2f", radians);

       double sin = Math.sin(radians);
       String sString = String.format("%.2f", sin);

       double cos = Math.cos(radians);
       String cString = String.format("%.2f", cos);

       System.out.println("You enter " + s + " degrees" +
                ". It's equal " + rString +
                " radians. Cos is: " + cString + " and sin is: " + sString);



    }
}