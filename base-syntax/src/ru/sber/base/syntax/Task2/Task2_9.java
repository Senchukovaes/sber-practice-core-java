package ru.sber.base.syntax.Task2;

import java.util.Scanner;
public class Task2_9 {
    public static void main(String[] args){
        int numberOfLetter = (int) (Math.random() * ((90 - 65) + 1) + 65);
        Scanner uLetter = new Scanner(System.in);
        while (true) {
            char userLetter = uLetter.next().charAt(0);
            if (userLetter < 65 || userLetter > 122 || (userLetter > 90 && userLetter < 97)) {
                System.out.println("Введён недопустимый символ");
            } else {
                if (userLetter >= 97 && userLetter <= 122) {
                    userLetter -= 32;
                }
                if (userLetter == numberOfLetter) {
                    System.out.println("Верно!");
                    break;
                }
                else if (userLetter > numberOfLetter) {
                    System.out.println("Ищи букву, которая перед ней в алфавите");
                }
                else if (userLetter < numberOfLetter) {
                    System.out.println("Ищи букву, которая после неё в алфавите");
                }
            }
        }


    }
}
