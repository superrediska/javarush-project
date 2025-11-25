package ru.javarush.java.core.level02.task08;

public class Solution {
    public static void main(String[] args) {
        String cityName = "  Minsk  ";
        System.out.println(cityName.length());
        cityName = cityName.trim();
        System.out.println(cityName.length());
        System.out.println(cityName.toUpperCase());
        System.out.println(cityName.toLowerCase());
        // Объявляем строковую переменную с лишними пробелами в начале и конце


        // Выводим длину строки до удаления пробелов


        // Удаляем пробелы по краям и сохраняем результат обратно в переменную


        // Выводим длину строки после удаления пробелов


        // Выводим название города в верхнем и нижнем регистре


    }
}