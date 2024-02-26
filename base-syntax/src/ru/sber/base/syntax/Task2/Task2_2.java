package ru.sber.base.syntax.Task2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        int k = 7;
        Scanner n = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int number = n.nextInt();
        if (number > 500 || number < 1) {
            System.out.println("Введено недопустимое число: " + number +". Допустимый диапазон значений: 1-500.");
        } else {
            for (int i=0; i<number; i++) {
                System.out.print(k+" ");
                k += 7;
            }
        }
    }
}
