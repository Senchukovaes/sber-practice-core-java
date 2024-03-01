package ru.sber.base.syntax.Task2;

import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        boolean isPrime = true;
        if (number < 2){
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

    }
}
