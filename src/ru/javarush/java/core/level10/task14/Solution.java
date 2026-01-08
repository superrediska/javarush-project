package ru.javarush.java.core.level10.task14;

// Перечисление с четырьмя временами года

enum Season{
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN
}

public class Solution {
    public static void main(String[] args) {
        Season month = Season.SUMMER;
        switch (month) {
            case WINTER -> System.out.println("Пора кататься на лыжах!");
            case SPRING -> System.out.println("Все цветет!");
            case SUMMER -> System.out.println("Лето — время отпусков!");
            case AUTUMN -> System.out.println("Грустное время(");
        }
        // Создаем переменную типа Season и присваиваем ей значение SUMMER


        // Для каждого сезона выводим свое жизнерадостное сообщение

    }
}