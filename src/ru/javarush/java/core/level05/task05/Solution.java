package ru.javarush.java.core.level05.task05;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pyramidHeight = scan.nextInt();


        // Создаем сканер для чтения числа с консоли


        // Строим обелиск строка за строкой
        for (int i = 1; i <= pyramidHeight; i++) {
            int space = pyramidHeight - i;

            // Количество пробелов слева: уменьшается от (N - 1) до 0
            int stars = 2*i -1;

            // Количество звездочек: растет по формуле (2 * row - 1)


            // Печатаем пробелы для выравнивания
            for (int y = 0; y < space; y++) {
                System.out.print(" ");

            }
            // Печатаем звездочки
            for (int u = 0; u < stars; u++) {
                System.out.print("*");
            }
            System.out.println();
            // Переход на новую строку после каждой строки обелиска

        }
    }
}