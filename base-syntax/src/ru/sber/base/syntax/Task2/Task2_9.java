package ru.sber.base.syntax.Task2;

import java.util.Scanner;
public class Task2_9 {
    public static void main(String[] args){
        int numberOfLetter = (int) (Math.random() * ((90 - 65) + 1) + 65);
        Scanner uLetter = new Scanner(System.in);
        while (true) {
            char userLetter = uLetter.next().charAt(0);
            int numberOfUserLetter = (int)userLetter;
            if (numberOfUserLetter < 65 || numberOfUserLetter > 122 || (numberOfUserLetter > 90 && numberOfUserLetter < 97)) {
                System.out.println("Введён недопустимый символ");
            } else {
                if (numberOfUserLetter >= 97 && numberOfUserLetter <= 122) {
                    numberOfUserLetter -= 32;
                }
                if (numberOfUserLetter == numberOfLetter) {
                    System.out.println("Верно!");
                    break;
                }
                else if (numberOfUserLetter > numberOfLetter) {
                    System.out.println("Ищи букву, которая перед ней в алфавите");
                }
                else if (numberOfUserLetter < numberOfLetter) {
                    System.out.println("Ищи букву, которая после неё в алфавите");
                }
            }
        }


    }
}
