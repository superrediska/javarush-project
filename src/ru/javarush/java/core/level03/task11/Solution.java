package ru.javarush.java.core.level03.task11;

public class Solution {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWeekend = true;
        boolean canGoToPark = isSunny && isWeekend;
        boolean canStayHome = !isWeekend || !isSunny;
        System.out.println(canGoToPark);
        System.out.println(canStayHome);


        // В парк идём только если одновременно солнечно И выходные


        // Остаёмся дома, если НЕ солнечно ИЛИ НЕ выходные


        // Вывод значений на экран


    }
}