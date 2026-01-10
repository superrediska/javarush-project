package ru.javarush.java.core.level14.task14;

public class Solution {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User("Алиса");
        System.out.println(user.userName + " " + user.userAge);
        System.out.println(user1.userName + " " + user1.userAge);
        // Регистрируем анонимного пользователя (конструктор без параметров)


        // Регистрируем пользователя с именем "Алиса" (конструктор с одним параметром)


        // Выводим значения полей каждого пользователя

    }
}