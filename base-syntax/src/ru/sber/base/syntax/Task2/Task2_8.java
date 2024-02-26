package ru.sber.base.syntax.Task2;

public class Task2_8 {
    public static void main(String[] args) {
        int a[] = new int[30];
        for (int i=0; i<30; i++) {
            a[i] = (int) (Math.random() * 1001);
        }
        for (int i=0; i<=29; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        System.out.println("________");
        int tmp;
        //BubbleSort
        for (int i=29; i>0; i--) {
            for (int j=0; j<i; j++) {
                if (a[j] > a[j+1]) {
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }

            }
        }

        for (int i=0; i<=29; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
