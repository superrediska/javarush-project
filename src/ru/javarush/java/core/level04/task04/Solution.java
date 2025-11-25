package ru.javarush.java.core.level04.task04;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        while (!(num < 0)){
            sum += num;
            num = scan.nextInt();
        }
        System.out.println(sum);
        // Создаем Scanner для чтения данных с консоли


        // Сумма всех введенных стоимостей


        // Запрашиваем первую стоимость чашки кофе


        // Используем цикл while для продолжения ввода до тех пор, пока не будет введено отрицательное число


        // Выводим итоговую сумму расходов на кофе (отрицательное значение в сумму не входит)

    }
}