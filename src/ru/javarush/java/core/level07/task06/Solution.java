package ru.javarush.java.core.level07.task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String[] favoriteMovies = new String[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<favoriteMovies.length; i++){
            String string = scan.nextLine();
            favoriteMovies[i] = string;
        }
        System.out.println(favoriteMovies[2]);
        System.out.println(favoriteMovies[1]);
        System.out.println(favoriteMovies[0]);
        // Создаем массив фиксированной длины 3 для любимых фильмов


        // Создаем Scanner для чтения строк с клавиатуры


        // Считываем три названия фильмов и сохраняем по порядку в массив


        // Выводим фильмы в обратном порядке: третий, второй, первый


    }
}