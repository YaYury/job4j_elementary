package ru.job4j.calculate;

public class MaxNumber {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int c = 2;
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (max > c) {
            System.out.println("Максимальное число: " + max);
        } else {
            System.out.println("Максимальное число: " + c);
        }
    }
}
