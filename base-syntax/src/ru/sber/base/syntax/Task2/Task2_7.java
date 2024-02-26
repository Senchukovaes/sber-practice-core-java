package ru.sber.base.syntax.Task2;

import java.util.Scanner;
public class Task2_7 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Введите a = ");
        double a = aa.nextDouble();
        Scanner bb = new Scanner(System.in);
        System.out.print("Введите b = ");
        double b = bb.nextDouble();
        Scanner cc = new Scanner(System.in);
        System.out.print("Введите c = ");
        double c = cc.nextDouble();
        double D = b*b - 4*a*c;
        if (D>0) {
            double x1 = (-b + Math.sqrt(D))/(2*a);
            double x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("X1 = "+x1+ ", X2 = "+x2);
        }
        else if (D==0) {
            double x = -b/(2*a);
            System.out.println("X = " +x);
        } else {
            System.out.println("Корней нет");
        }

    }
}
