package lemon.mKuleshov.HW2;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Point1(0,10,10,0);
        Point2();
        Point3();
        Point4();
        Point5();
        Point6();
    }

    //1. Расстояние между двумя точками.
    public static double Point1(double x1, double y1, double x2, double y2) {
        double point =  Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println("Paragraph 1. Distance between points is: "+point);
        return point;
    }

    //2. Расстояние от данной точки до другой точки.
    static void Point2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Point 2. Enter coordinates (x1,y1; x2,y2): ");
        double x1Point2 = scanner.nextDouble();
        double y1Point2 = scanner.nextDouble();
        double x2Point2 = scanner.nextDouble();
        double y2Point2 = scanner.nextDouble();

        double point2 = Point2D.distance(x1Point2, y1Point2, x2Point2, y2Point2);
        System.out.println("Distance between your points is: " + point2);
    }

    //3. Расстояние от данной точки до начала координат.
    static void Point3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Point 3. Enter coordinates (x,y): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double point3 = Point2D.distance(0, 0, x2, y2);
        System.out.println("Distance between your points is: " + point3);
    }

    //4. Сдвиг точки по оси X на заданную величину.
    static void Point4() {
        double x1 = 0;
        double y1 = 0;
        double x2 = 10;
        double y2 = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Point 4. Enter number for dislocation X: ");
        double xDislocation = scanner.nextDouble();
        double x1change = x1 + xDislocation;
        double x2change = x2 + xDislocation;
        System.out.println("Begin coordinates is: x1 = " + x1 + "; y1 = " + y1 + "; x2 = " + x2 + "; y2 = " + y2);
        System.out.println("Change coordinates is: x1 = " + x1change + "; y1 = " + y1 + " x2 = " + x2change + "; y2 = " + y2);
    }

    //5. Сдвиг точки по оси Y на заданную величину.
    static void Point5() {
        double x1 = 0;
        double y1 = 0;
        double x2 = 10;
        double y2 = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Paragraph 5. Enter number for dislocation Y: ");
        double yDislocation = scanner.nextDouble();
        double y1change = y1 + yDislocation;
        double y2change = y2 + yDislocation;
        System.out.println("Old coordinates is: x1 = " + x1 + "; y1 = " + y1 + "; x2 = " + x2 + "; y2 = " + y2);
        System.out.println("New coordinates is: x1 = " + x1 + "; y1 = " + y1change + " x2 = " + x2 + "; y2 = " + y2change);
    }

    //6. Два метода для получения X- и Y-координаты точки.
    static void Paragraph6() {
        while (true) {
            PointerInfo pointerInfo = MouseInfo.getPointerInfo();
            Point location = pointerInfo.getLocation();
            System.out.println("x = " + location.getX());
            System.out.println("y = " + location.getY());


        }
    }
}
