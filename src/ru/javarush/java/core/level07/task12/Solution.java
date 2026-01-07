package ru.javarush.java.core.level07.task12;

public class Solution {
    public static void main(String[] args) {
        int[][] sensorData = new int[2][5];
        int cn = 10;
        for (int i = 0; i < sensorData.length; i++) {
            for (int j = 0; j < sensorData[i].length; j++) {
                sensorData[i][j] = cn++;
            }
        }
        for (int i = 0; i < sensorData.length; i++) {
            for (int j = 0; j < sensorData[i].length; j++) {
                System.out.print(sensorData[i][j]);
                if (j < sensorData[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Создаем двумерный массив для хранения показаний (2 строки, 5 столбцов)

        // Начальное значение для заполнения массива


        // Заполняем массив по строкам, слева направо


        // Выводим массив в виде таблицы


        // Печатаем значение элемента

        // Если это не последний элемент в строке, добавляем пробел


        // После каждой строки переходим на новую


    }
}