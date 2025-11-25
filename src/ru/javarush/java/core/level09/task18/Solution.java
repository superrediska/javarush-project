package ru.javarush.java.core.level09.task18;

public class Solution {
    public static void main(String[] args) {
        // Создаем StringBuilder с исходной фразой

        StringBuilder stringBuilder = new StringBuilder("Привет, мир!");
        // Находим позицию запятой
        int index = stringBuilder.indexOf(",");
        int poss = index + 2;
        stringBuilder.insert(poss, "Java ");
        System.out.println(stringBuilder);


        // В исходной строке после запятой стоит пробел,
        // поэтому вставляем после запятой и пробела (+2)


        // Вставляем подстроку "Java" (с пробелом в конце)


        // Выводим результат

    }
}