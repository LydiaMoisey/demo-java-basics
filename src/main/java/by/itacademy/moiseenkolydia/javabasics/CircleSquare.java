package by.itacademy.moiseenkolydia.javabasics;

import java.util.Scanner;

public class CircleSquare {
    public double getCircleSquare(int radius) {
        double square = 2 * Math.PI * Math.pow(radius, 2);
        return square;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус");
        int radius = scanner.nextInt();
        CircleSquare number = new CircleSquare();
        double circleSquare = number.getCircleSquare(radius);
        System.out.println("Площадь круга с радиусом " + radius + " равна " + circleSquare);
    }
}
