package ru.javarush.java.core.level10.task07;

public class Solution {
    public static void main(String[] args) {
        System.out.println(MathFormulas.PI_VALUE);
        // Выводим значение константы PI_VALUE, обращаясь к ней через имя класса MathFormulas
        
    }
    public static class MathFormulas{
        public static final double PI_VALUE = 3.1415926535;

    }
}