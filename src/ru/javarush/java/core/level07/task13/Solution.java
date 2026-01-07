package ru.javarush.java.core.level07.task13;

public class Solution {
    public static void main(String[] args) {
        int[][] playerAchievements = new int[3][];
        playerAchievements[0] = new int[]{1,2};
        playerAchievements[1] = new int[]{2,3,4,5};
        playerAchievements[2] = new int[]{6};
        for (int i = 0; i < playerAchievements.length; i++) {
            for (int j = 0; j < playerAchievements[i].length; j++) {
                if (j > 0){
                    System.out.print(" ");
                }
                System.out.print(playerAchievements[i][j]);
            }
            System.out.println();
        }
        // Создаем зубчатый массив (каждая "строка" может иметь свою длину)

                // 1-й уровень: 2 достижения
                // 2-й уровень: 4 достижения
                // 3-й (бонусный) уровень: 1 достижение

        // Выводим каждую строку массива на отдельной строке

        // Печатаем элементы строки, разделяя пробелом

        // перед первым элементом пробел не ставим


        // перенос строки после каждой "строки" массива


    }
}