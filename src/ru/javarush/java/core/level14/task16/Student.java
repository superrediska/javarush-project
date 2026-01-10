package ru.javarush.java.core.level14.task16;

public class Student {
    String studentName;
    String studentGroup;
    int studentScore;

    Student(String studentName, String studentGroup, int studentScore) {
        this.studentName = studentName;
        this.studentGroup = studentGroup;
        this.studentScore = studentScore;
    }

    Student(String studentName, String studentGroup) {
        this.studentName = studentName;
        this.studentGroup = studentGroup;
        studentScore = 0;
    }

    Student(String studentName) {
        this.studentName = studentName;
        studentGroup = "Unknown";
        studentScore = 0;
    }
    Student(){
        studentName = "Unknown";
        studentGroup = "Unknown";
        studentScore = 0;
    }

}
