package ru.javarush.java.core.level04.task07;

public class Solution {
    public static void main(String[] args) {
        int N = 7;
        int price = 0;
        for (int i = 1; i <= N; i++) {
            price+= i;
        }
        System.out.println(price);

    }
}