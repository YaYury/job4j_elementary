package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        double residue = amount;
        while (residue > 0) {
                residue = residue + (residue * percent) - salary;
                year += 1;
            }
        return year;
    }
}
