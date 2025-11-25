package ru.javarush.java.core.level05.task01;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите высоту лестницы");
        int ladderHeight = scan.nextInt();

        // Создаем объект Scanner для чтения ввода пользователя


        // Запрашиваем у пользователя высоту лестницы


        // Внешний цикл — по количеству ступеней (строк)
        for (int i = 1; i <= ladderHeight; i++) {

            // Внутренний цикл — печатает нужное количество символов '#'
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            // Переход на новую строку после каждой ступеньки
            System.out.println();
        }
    }
}