package by.itacademy.moiseenkolydia.javabasics;

import java.util.Scanner;

public class News {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество новостей");
        int numberOfNews = scanner.nextInt();
        CalculatorOfNewPages number = new CalculatorOfNewPages();
        int numberOfPages = number.calculateNumberOfPages(numberOfNews);
        System.out.println("Количество страниц для " + numberOfNews + " новостей - " + numberOfPages);
    }
}
