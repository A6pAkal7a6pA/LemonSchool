package lemon.mKuleshov.HWmasbinary;

import java.util.Scanner;

public class BinarySort {

    private static int mas[] = new int[10];

    private static void printArray(int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = (int)(Math.random()*10);
            System.out.print(" "+anArray[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printArray(mas);
        selectionSort(mas);
        System.out.println("Enter the item you want to find: ");
        int num = scanner.nextInt();
        find(mas, num);
}

    public static void selectionSort(int[] arr) {
    /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < arr.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = arr[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i + 1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    public static void find(int[] arr, int i) {
        int last = arr.length - 1;
        int first = 0;
        int mid = (last + 1) / 2;
        while (arr[mid] != i && last != mid && first != mid) {
            if (arr[mid] < i) {
                first = mid;
                mid = (last + first) / 2;
            } else {
                last = mid;
                mid = (last + first) / 2;
            }
        }
        if (arr[last] == i)
            mid = last;
        if (arr[first] == i)
            mid = first;
        System.out.print(arr[mid] == i ? mid : "Element not found");
    }
}
