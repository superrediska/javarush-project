package ru.javarush.java.core.level07.task19;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] dailyTemperatures = {10, 20, 30, 40, 50, 60, 70};
        int[] dt = Arrays.copyOfRange(dailyTemperatures, 2, 5);
        System.out.println(Arrays.toString(dt));
        // Исходный массив температур за день


        // Копируем элементы с индексами 2 (включительно) до 5 (не включая 5): 30, 40, 50


        // Выводим полученный подмассив в формате [30, 40, 50]
        
    }
}