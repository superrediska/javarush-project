package ru.javarush.java.core.level04.task11;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        do {
            System.out.println("Меню:");
            System.out.println("1. Вывести приветствие");
            System.out.println("2. Выйти");
            a = scan.nextInt();
            if (a == 1) {
                System.out.println("Привет!");
            }

        } while (!(a == 2));
    }
}