package ru.javarush.java.core.level09.task09;

public class Solution {
    public static void main(String[] args) {
        // Объявляем строку с секретным словом
        String secret = "Java";

        // Извлекаем символ с индексом 1 (второй символ, т.к. индексация с нуля) методом charAt()
        char charAt = secret.charAt(1);
        System.out.println(charAt);
        // Выводим извлеченный символ на экран

    }
}