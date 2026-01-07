package ru.javarush.java.core.level07.task04;

public class Solution {
    public static void main(String[] args) {
        int[] roundScores = new int[10];
        for (int i = 0; i< roundScores.length; i++){
            roundScores[i] = i + 1;
        }
        for (int i = 0; i < roundScores.length; i++){
            System.out.print(roundScores[i]);
            if (i < roundScores.length - 1){
                System.out.print(" ");
            }
        }
        // Создаем массив длиной 10 элементов


        // Заполняем массив числами от 1 до 10 с помощью цикла



        // Выводим все элементы массива в одну строку, разделяя их пробелом

        // Выводим текущий элемент массива

        // Добавляем пробел между элементами, кроме последнего


    }
}