package ru.javarush.java.core.level09.task15;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две строковые переменные с начальными значениями
        String first = "apple";
        String second = "banana";
        System.out.println(first.compareTo(second));
        // Сравниваем строки лексикографически:
        String third = first;
        first = second;
        second = third;
        System.out.println(first.compareTo(second));

        // Меняем значения переменных местами


        // Повторяем сравнение после обмена

    }
}