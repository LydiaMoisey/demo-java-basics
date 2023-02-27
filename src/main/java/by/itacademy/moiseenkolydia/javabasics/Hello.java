package by.itacademy.moiseenkolydia.javabasics;

import java.util.Scanner;

public class Hello {
    public String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        return name;
    }

    public static void main(String[] args) {
        Hello name = new Hello();
        System.out.println("Hello, " + name.getName() + "!");
    }
}
