package by.itacademy.moiseenkolydia.javabasics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double doubleResult;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double firstNumber = scanner.nextDouble();
        System.out.println("Введите второе число");
        double secondNumber = scanner.nextDouble();
        System.out.println("Введите знак операции");
        String sign = scanner.next();
        switch (sign) {
            case "+":
                doubleResult = firstNumber + secondNumber;
                System.out.println("Результат = " + doubleResult);
                break;
            case "-":
                doubleResult = firstNumber - secondNumber;
                System.out.println("Результат = " + doubleResult);
                break;
            case "*":
                doubleResult = firstNumber * secondNumber;
                System.out.println("Результат = " + doubleResult);
                break;
            case "/":
                doubleResult = firstNumber / secondNumber;
                System.out.println("Результат = " + doubleResult);
                break;
            case "%":
                doubleResult = firstNumber % secondNumber;
                System.out.println("Результат = " + doubleResult);
                break;
            default:
                System.out.println("Неверно указан знак или число. Знак операции должен быть одним из следующих: + - / * %");
                break;
        }
    }
}
