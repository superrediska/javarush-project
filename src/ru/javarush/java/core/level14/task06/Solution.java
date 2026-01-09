package ru.javarush.java.core.level14.task06;

public class Solution {
    public static void main(String[] args) {
        Student student = new Student("Алина", 18);
        System.out.println("Имя: " + student.studentName + ", оценка: " + student.studentGrade);
        // "Зачисляем" нового студента, сразу задавая имя и оценку в конструкторе


        // Торжественно объявляем о его появлении

    }
}
class Student{
    String studentName;
    int studentGrade;
    Student(String studentName, int studentGrade){
        this.studentGrade = studentGrade;
        this.studentName = studentName;
    }
}
// Отдельный класс Student с полями и конструктором