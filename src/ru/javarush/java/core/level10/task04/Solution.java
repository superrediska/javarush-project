package ru.javarush.java.core.level10.task04;

public class Solution {
    public static void main(String[] args) {
        // Строковое значение, пришедшее от датчика
        String sensorReadingText = "NaN";
        double parsedSensorData = Double.parseDouble(sensorReadingText);
        System.out.println(Double.isNaN(parsedSensorData));
        // Преобразуем строку в число типа double с помощью класса Double


        // Проверяем, является ли полученное значение "не числом" (NaN)


        // Выводим результат проверки (true/false)

    }
}