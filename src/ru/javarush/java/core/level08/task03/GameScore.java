package ru.javarush.java.core.level08.task03;

public class GameScore {
    private static int totalGameScore = 0;
    public static void collectCoin(){
        totalGameScore++;
    }
    public static void displayCurrentScore(){
        System.out.println(totalGameScore);
    }
    // Приватный общий счет для всей игры — доступен только внутри класса


    // Увеличиваем счет на 1 каждый раз, когда игрок собирает монетку


    // Выводим текущий общий счет на экран


    public static void main(String[] args) {
        collectCoin();
        collectCoin();
        collectCoin();
        displayCurrentScore();

        // Игрок собрал три монетки


        // Показываем текущий счет

    }
}