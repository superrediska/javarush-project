package ru.javarush.java.core.level04.task14;

public class Solution {
    public static void main(String[] args) {
        // Массив с оценками товаров
        int[] productRatings = {3, -2, 7, -5, 8, 0};

        // Цикл for для перебора всех элементов массива
        for (int rating : productRatings) {
            if (rating < 0){
                continue;
            }
            // Выводим на экран только качественные товары (положительные числа)
            System.out.println(rating);
        }
    }
}