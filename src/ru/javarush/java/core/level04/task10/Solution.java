package ru.javarush.java.core.level04.task10;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        int a = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введите PIN-код");
            a = scan.nextInt();
        } while (a < 1000 || a > 9999);
        System.out.println("PIN-код принят");
    }
}