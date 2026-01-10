package ru.javarush.java.core.level14.task19;

public class Solution {
    public static void main(String[] args) {
        Car newCar = new Car();
        // Запускаем "сборку" новой машины: при создании объекта сработает нестатический блок инициализации
        
    }
}
class Car{
    String carModel = "Неизвестно";
    {
        System.out.println("Создаётся объект Car, model = " + carModel);
    }
}
// "Чертёж" автомобиля