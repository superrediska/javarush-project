package ru.javarush.java.core.level14.task11;

// Класс-шаблон для автомобиля: хранит марку и год выпуска
class Car {
    String carBrand;
    int carYear;

}

public class Solution {
    public static void main(String[] args) {
        Car car = new Car();
        car.carBrand = "Toyota";
        car.carYear = 2020;
        Car car1 = new Car();
        car1.carBrand = "Lada";
        car1.carYear = 2010;
        System.out.println("Марка: " + car.carBrand + ", год выпуска: " + car.carYear);
        System.out.println("Марка: " + car1.carBrand + ", год выпуска: " + car1.carYear);
        // Создаем два независимых объекта класса Car с помощью new


        // Инициализируем поля первого автомобиля


        // Инициализируем поля второго автомобиля


        // Выводим информацию о каждом автомобиле в требуемом формате

    }
}