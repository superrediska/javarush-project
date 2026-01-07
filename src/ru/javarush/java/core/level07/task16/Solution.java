package ru.javarush.java.core.level07.task16;

public class Solution {
    public static void main(String[] args) {
        int[][] zoneTemperatures = {
                {1, 2 ,3},
                {4, 5},
                {6, 7, 8, 9}
        };
        int maxValue = Integer.MIN_VALUE;
        for (int[]zone : zoneTemperatures){
            for (int temp : zone){
                if (temp > maxValue){
                    maxValue = temp;
                }
            }
        }
        System.out.println(maxValue);
        // Создаем зубчатый массив с заданным количеством элементов в каждой строке
        // Зона A: три датчика
        // Зона B: два датчика
        // Зона C: четыре датчика

        // Инициализируем переменную для хранения максимального значения


        // Проходим по всем элементам зубчатого массива


        // Обновляем максимальное значение, если текущая температура больше




        // Выводим максимальное значение температуры на экран

    }
}