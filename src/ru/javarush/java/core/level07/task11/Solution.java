package ru.javarush.java.core.level07.task11;

public class Solution {
    public static void main(String[] args) {
        int[][] warehouseInventory = new int[3][4];
        int cn = 1;
        for (int i = 0; i < warehouseInventory.length; i++) {
            for (int j = 0; j < warehouseInventory[i].length; j++) {
                warehouseInventory[i][j] = cn;
                cn++;
            }
        }
        System.out.println(warehouseInventory[1][2]);
        // Создаем двумерный массив размером 3 строки и 4 столбца


        // Переменная для заполнения массива числами от 1 до 12


        // Вложенные циклы для заполнения массива
        // Проходим по строкам
        // Проходим по столбцам
        // Заполняем текущую ячейку
        // Увеличиваем число для следующей ячейки


        // Вывод значения из второй строки и третьего столбца
        // Индексы в массиве начинаются с 0, поэтому вторая строка — это индекс 1, третий столбец — это индекс 2

    }
}