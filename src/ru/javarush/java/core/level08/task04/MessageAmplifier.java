package ru.javarush.java.core.level08.task04;

public class MessageAmplifier {

    // Публичный статический метод, который повторяет строку и выводит результат
    public static void amplifyAndDisplay(String messageText, int numberOfRepeats) {
        String result = "";
        for (int i = 0; i < numberOfRepeats; i++) {
            result+= messageText;
        }
        // Используем обычную строку и оператор +



        // Выводим итоговую "усиленную" строку
        System.out.println(result);

    }

    public static void main(String[] args) {
        // Демонстрация работы: усиливаем сообщение "Ура!" четыре раза
        amplifyAndDisplay("Ура!", 4);
    }
}