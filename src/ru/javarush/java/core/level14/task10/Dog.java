package ru.javarush.java.core.level14.task10;

public class Dog {
    // Поля с основной информацией о собаке
    String dogName;
    int dogAge;
    Dog (String dogName, int dogAge){
        this.dogAge = dogAge;
        this.dogName = dogName;
    }

    // Конструктор "регистрации": сразу присваиваем имя и возраст


    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 5);
        System.out.println("Собаку зовут " + dog.dogName + ", ей " + dog.dogAge + " лет");
        // "Поступление" новой собаки в приют: задаём имя и возраст через конструктор


        // Торжественное объявление о прибытии

    }

}