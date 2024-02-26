package ru.sber.base.syntax.Task2;

import java.lang.Math;
public class Task2_6 {
    public static void main(String[] args) {
        int a[] = new int[100];
        for (int i=0; i<100; i++) {
            a[i] = (int) (Math.random() * 1001);
        }
        int amax = 0;
        int j = 0;
        //Находим максимальный элемент
        for (int i=0; i<100; i++) {
            if (a[i] > amax) {
                amax = a[i];
                j = i;
            }
        }
        int S = 0;
        for (int i=0; i<100; i++) {
            S = S + a[i];
        }
        System.out.println("Максимальное значение = " +amax+ " находится в элементе под индексом " +j);
        System.out.println("Среднее значение = " + S/100);

    }
}
