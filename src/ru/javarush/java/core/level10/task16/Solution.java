package ru.javarush.java.core.level10.task16;

// Перечисление космических тел с фиксированными значениями
enum CelestialBody {
    EARTH, MARS, JUPITER;
}

public class Solution {
    public static void main(String[] args) {

        // 1) Создаем переменную типа CelestialBody и присваиваем ей MARS
        CelestialBody mars = CelestialBody.MARS;
        System.out.println(mars.name());
        System.out.println(mars.ordinal());

        // 2) Выводим официальное имя текущей планеты через специальный метод name()


        // 3) Выводим "порядковый номер" текущей планеты через метод ordinal()


        // 4) Преобразуем строку "JUPITER" в значение перечисления через valueOf()
        String incoming = "JUPITER";
        CelestialBody jup = CelestialBody.valueOf(incoming);
        System.out.println(jup);


        // Выводим новое значение enum для подтверждения переключения

    }
}