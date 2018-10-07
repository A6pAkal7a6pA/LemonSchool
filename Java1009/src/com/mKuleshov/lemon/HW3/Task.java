package lemon.mKuleshov.HW3;

import java.util.Random;
import java.util.Scanner;

public class Task {
    private static String mCHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static Random random = new Random();
    private static StringBuilder array[] = new StringBuilder[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lenght: ");
        int l = scanner.nextInt();
        System.out.println("Before: ");
        printArray(RandomArray(l));
        System.out.println("After: ");
        printArray(RandomChange(array));
    }
//-------------------------------------------------------------
    public static StringBuilder[] RandomArray(int lenght) {
        for(int j = 0; j < 10; j++) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < lenght; i++) {
                char m = mCHAR.charAt(random.nextInt(mCHAR.length()));
                sb.append(m);
            }
            array[j] = sb;
        }
        return array;
    }
//-------------------------------------------------------------
private static void printArray(StringBuilder[] array ) {
        for (int i=0;i<array.length;i++){
            System.out.print(" "+array[i].toString());
        }
    System.out.println();

}
//-----------------------------------------------------------------------------
public static StringBuilder[] RandomChange(StringBuilder[] array) {
    for(int i = 0; i < 10; i++) {
        StringBuilder sb = new StringBuilder(array[i]);
        for(int c = 0; c < 3; c++) {
            char m = mCHAR.charAt(random.nextInt(mCHAR.length()));
            int n = random.nextInt(sb.length());
            sb.setCharAt(n, m);
        }
        array[i] = sb;
    }
    return array;
}
    }
