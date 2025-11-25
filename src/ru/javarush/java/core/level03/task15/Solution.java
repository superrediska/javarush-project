package ru.javarush.java.core.level03.task15;

public class Solution {
    public static void main(String[] args) {
        boolean hasInvitation = true;
        boolean dressCodeMet = false;
        boolean passwordIsCorrect = true;
        boolean admitted = hasInvitation && dressCodeMet && passwordIsCorrect;
        boolean admitted1 =  (hasInvitation && dressCodeMet) && passwordIsCorrect;
        boolean admitted2 =  hasInvitation && (dressCodeMet && passwordIsCorrect);
        System.out.println(admitted);
        System.out.println(admitted1);
        System.out.println(admitted2);
        // Объявляем и инициализируем переменные для условий допуска


        // Основное логическое выражение без дополнительных скобок


        // Выражение с группировкой первых двух условий


        // Выражение с группировкой последних двух условий


        // Выводим результаты всех трёх выражений на экран


    }
}