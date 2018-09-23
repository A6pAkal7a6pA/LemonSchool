package com.mKuleshov.lemon.HW1;

import java.util.Scanner;

public class Task14 {
    //Напишите метод переводящий гривны в доллары по заданному курсу.
    // В качестве аргументов передайте кол-во гривен и курс.
    static double CCurs(int kol, double curs){
        System.out.print(kol+" grn in dollars po cursu "+curs+ " = ");
        return (kol*curs) ;
    }

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter kollovo grn: ");
        double kollovo = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter curs dollara: ");
        double kurs = scanner2.nextDouble();

        System.out.println(CCurs((int) kollovo, kurs));

    }

}
