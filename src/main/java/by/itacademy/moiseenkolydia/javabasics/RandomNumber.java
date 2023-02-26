package by.itacademy.moiseenkolydia.javabasics;

import java.util.Scanner;

public class RandomNumber {
    public int getRandomNumber(int numberOfDigits) {
        int range = 10;
        if (numberOfDigits == 0)
            return (int) (Math.random() * 10);
        else {
            for (int i = 2; i <= numberOfDigits; i++) {
                range = range * 10;
            }
            return (int) (Math.random() * (range - range / 10) + (range / 10));
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, сколько знаков должно быть в числе");
        int numberOfDigits = scanner.nextInt();
        RandomNumber number = new RandomNumber();
        int randomNumber = number.getRandomNumber(numberOfDigits);
        System.out.println(randomNumber);
    }
}
