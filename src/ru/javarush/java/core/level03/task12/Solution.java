package ru.javarush.java.core.level03.task12;

public class Solution {
    public static void main(String[] args) {
        int roomTemperature = 20;
        boolean isComfortable;
        if  (roomTemperature <= 25 && roomTemperature >= 20){
            isComfortable = true;
        }
        else {
            isComfortable = false;

        }
        System.out.println(isComfortable);
        // Объявляем переменную roomTemperature типа int


        // Проверяем, находится ли roomTemperature в диапазоне от 20 до 25 включительно


        // Выводим значение переменной isComfortable на экран

    }
}