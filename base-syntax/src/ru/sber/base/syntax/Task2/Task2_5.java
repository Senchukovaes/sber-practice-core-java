package ru.sber.base.syntax.Task2;

import java.util.Scanner;
public class Task2_5 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        int a1 = 0;
        int a2 = 1;
        if (number > 100 || number < 2) {
            System.out.println("Введено недопустимое значение:" + number +". Допустимый диапазон значений: 2-100.");
        } else if (number==2) {
                System.out.print(a1 +" ");
                System.out.println(a2);
               }
        else {
                System.out.print(a1 + " ");
                System.out.print(a2 + " ");
                for (int i=3; i<number; i++){
                    System.out.print(a1+a2 +" ");
                    int a = a1;
                    a1 = a2;
                    a2 = a + a2;
                }
            }

    }
}
