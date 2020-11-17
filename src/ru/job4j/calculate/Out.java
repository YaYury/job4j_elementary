package ru.job4j.calculate;

public class Out {
    public static void main(String[] args) {
        String lyrics = "Мама мыла раму";
        System.out.println(lyrics);
        String name = "Petr";
        String surname = "Arsentev";
        String separate = " ";
        String id = name + separate + surname;
        System.out.println(id);
        name = "Petr";
        byte age = 33;
        separate = " - ";
        id = name + separate + age + " years old";
        System.out.println(id);
        int first = 1;
        int second = 2;
        int onePlusTwo = first + second;
        System.out.println("1 + 2 = " + onePlusTwo);

    }

}

