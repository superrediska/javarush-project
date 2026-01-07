package ru.javarush.java.core.level07.task08;

public class Solution {
    public static void main(String[] args) {
        int[] hourlyTemperatures = {3, 11, 7, 4, 15, 2};
        int mx = 0;
        for (int i = 0; i< hourlyTemperatures.length; i++){
            if (hourlyTemperatures[i] > mx){
                mx = hourlyTemperatures[i];
            }
        }
        System.out.println(mx);
        // Быстрая инициализация массива с 6 элементами температур


        // Предполагаем, что первый элемент массива является максимальным


        // Проходим по всем элементам массива, начиная со второго

        // Если текущая температура больше сохранённой максимальной

        // Обновляем максимальную температуру



        // Выводим найденную максимальную температуру

    }
}