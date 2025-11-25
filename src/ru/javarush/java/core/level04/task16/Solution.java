package ru.javarush.java.core.level04.task16;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (true){
            int price = scan.nextInt();
            if (price < 0){
                System.out.println(sum);
                break;
            }
            sum += price;

        }
    }
}