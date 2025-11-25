package ru.javarush.java.core.level03.task19;

public class Solution {
    public static void main(String[] args) {
        int currentHour = 21;
        String greetingMessage = currentHour < 12 ? "Доброе утро" : "Добрый день";
        System.out.println(greetingMessage);
        // Объявляем переменную currentHour, которая хранит текущий час (от 0 до 23)


        // Используем тернарный оператор для выбора приветствия


        // Выводим приветственное сообщение на экран

    }
}