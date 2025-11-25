package ru.javarush.java.core.level03.task03;

public class Solution {
    public static void main(String[] args) {
        String userPassword = "qwerty";
        // Объявляем переменную userPassword и присваиваем ей значение "qwerty"


        // Проверяем, совпадает ли пароль с ожидаемым значением "qwerty"
        if (userPassword.equals("qwerty")) {
            System.out.println("Вход выполнен успешно");
            // Если условие истинно, выводим сообщение об успешном входе

        }

        // Если пароль не совпадает, блок else не используется и программа ничего не выводит
    }
}