package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second > first) {
            result = second;
        }
        if (third > result) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = MultiMax.max(4, 7, 5);
        System.out.println("Максимальное число: " + result);
    }
}
