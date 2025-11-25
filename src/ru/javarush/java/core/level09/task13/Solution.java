package ru.javarush.java.core.level09.task13;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две строки в разном регистре
        String s1 = "Hello";
        String s2 = "HELLO";
        boolean a = s1.equalsIgnoreCase(s2);
        System.out.println(a);
        // Сравниваем строки без учета регистра с помощью equalsIgnoreCase()


        // Выводим результат сравнения (true или false)

    }
}