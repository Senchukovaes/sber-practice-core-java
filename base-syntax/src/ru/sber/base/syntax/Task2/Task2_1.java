package ru.sber.base.syntax.Task2;

import java.util.Scanner;

public class Task2_1 {
    public static void main (String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = n.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
