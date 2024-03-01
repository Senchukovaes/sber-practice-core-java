package ru.sber.base.syntax.Task2;

public class Task2_3 {
    public static void main(String[] args) {
        for (int i=0; i<3; i++) {
            for (int j=0; j<10; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int j=0; j<9; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
