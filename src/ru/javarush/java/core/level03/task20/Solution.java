package ru.javarush.java.core.level03.task20;

public class Solution {
    public static void main(String[] args) {
        int visitorAge = 19;
        String ticketCategory = (visitorAge < 7) ? "Детский" :
                (visitorAge < 18) ? "Подростковый" :
                        (visitorAge < 65) ? "Взрослый" : "Пенсионный";
        System.out.println(ticketCategory);
        // Объявляем переменную возраста посетителя


        // Используем вложенные тернарные операторы для определения категории билета


        // Выводим категорию билета на экран

    }
}