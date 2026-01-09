package ru.javarush.java.core.level14.task05;

public class Solution {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari", 2022);
        // Создаем объект Car с произвольными значениями марки и года выпуска
        car1.displayDetails();

        // Просим автомобиль "представиться"

    }
}
class Car{
    String carBrand;
    int productionYear;
    public void displayDetails(){
        System.out.println("Марка: " + carBrand + ", год выпуска: " + productionYear);
    }
    Car (String carBrand, int productionYear){
        this.carBrand = carBrand;
        this.productionYear = productionYear;
    }
}
// Класс Car хранит марку и год выпуска и умеет выводить информацию о себе