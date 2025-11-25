package ru.javarush.java.core.level09.task20;

public class Solution {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Я люблю Java!");


        int start = stringBuilder.indexOf("люблю");
        stringBuilder.delete(start, start + "люблю ".length());


        int javaStart = stringBuilder.indexOf("Java");
        stringBuilder.replace(javaStart, javaStart + "Java".length(), "программирование");

        System.out.println(stringBuilder);
    }
}