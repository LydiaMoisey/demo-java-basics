package by.itacademy.moiseenkolydia.javabasics;

import java.util.Scanner;

public class SquareEquation {
    public static void main(String args[]) {

        int aNumber, bNumber, cNumber;
        int discriminant;
        Scanner numbers = new Scanner(System.in);
        System.out.println("Введите коэффициент a");
        aNumber = numbers.nextInt();
        System.out.println("Введите коэффициент b");
        bNumber = numbers.nextInt();
        System.out.println("Введите коэффициент c");
        cNumber = numbers.nextInt();
        discriminant = (int) Math.pow(bNumber, 2) - 4 * aNumber * cNumber;
        if (discriminant < 0)
            System.out.println("Нет корней");
        else if (discriminant == 0) {
            double xdo = (-bNumber / (2 * aNumber));
            System.out.println("Один корень " + xdo);
        } else if (discriminant > 0) {
            double x1 = (-bNumber - Math.sqrt(discriminant) / (2 * aNumber));
            double x2 = (-bNumber + Math.sqrt(discriminant) / (2 * aNumber));
            System.out.println("Два корня " + x1 + ", " + x2);
        }
    }
}
