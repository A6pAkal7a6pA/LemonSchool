package com.mKuleshov.lemon.HW1;

public class Task6 {
    //Напишите метод, который будет увеличивать заданный элемент массива на 10%.
 public static void main(String[] args) {

        System.out.println(increase(new int[] {10,20,30,40,50}));

    }
    static int increase(int[] a) {


        for (int i=0; i<a.length; i++){
            System.out.print(i+" - ");
            System.out.println(a[i]);
        }

        System.out.println("\nУвеличение массива на 10% \n");

        for (int k=0; k<a.length;k++){
            a[k]=(int) (a[k]*0.50);
            System.out.print(k+" - ");
            System.out.println(a[k]);
        }
        return 0 ;

    }
}
