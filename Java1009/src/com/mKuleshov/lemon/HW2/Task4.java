package lemon.mKuleshov.HW2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нужное количество символов: ");
            int n =scanner.nextInt();
            for ( int i = 0; i < n; i++ ) {
                char c = (char)(Math.random()*26 + 'a');
                System.out.print(c + ": ");
                switch ( c ) {
                    case 'a': case 'e': case 'i':
                    case 'o': case 'u':
                        System.out.println("гласная");
                        break;
                    case 'y': case 'w':
                        System.out.println("иногда гласная");
                        break;
                    default:
                        System.out.println("согласная");
                }
            }

        }

    }
