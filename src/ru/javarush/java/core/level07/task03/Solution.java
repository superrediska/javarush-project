package ru.javarush.java.core.level07.task03;

public class Solution {
    public static void main(String[] args) {

        double[] sensorReadings = new double[4];
        sensorReadings[2] = 3.14;
        System.out.println(sensorReadings[0] + " " + sensorReadings[1] + " " + sensorReadings[2] + " " + sensorReadings[3]);
        // Объявляем массив для хранения четырёх показаний датчиков


        // В элемент с индексом 2 (третий по счёту) записываем значение 3.14


        // Выводим все значения массива в одну строку, разделяя их пробелом


        // После каждого элемента, кроме последнего, выводим пробел


    }
}