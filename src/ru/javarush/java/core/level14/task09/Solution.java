package ru.javarush.java.core.level14.task09;

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.catAge = 3;
        cat.catName = "Барсик";
        System.out.println(cat.catAge);
        System.out.println(cat.catName);
        // Создаем нового кота с именем "Барсик" и возрастом 3 года (используем "new" и конструктор)


        // Выводим имя и возраст кота, чтобы подтвердить корректность создания объекта

    }
}
class Cat{
    String catName;
    int catAge;

}
// Шаблон (класс) кота с полями для имени и возраста