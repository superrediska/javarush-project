package ru.javarush.java.core.level04.task12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "";



        do {
            password = scan.nextLine();

        } while (password.length() < 6); // повторяем, пока пароль короче 6 символов
        System.out.println("Пароль надёжен, аккаунт создан!");


    }
}