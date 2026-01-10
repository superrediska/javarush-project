package ru.javarush.java.core.level14.task13;

public class Solution {
    public static void main(String[] args) {
        // Регистрируем книгу, у которой пока есть только название
        Book book = new Book("Загадочный роман");
        Book book1 = new Book("Путешествие по космосу", 500);
        System.out.println(book.bookTitle);
        System.out.println(book.pageCount);
        System.out.println(book1.bookTitle);
        System.out.println(book1.pageCount);

        // Регистрируем книгу с названием и количеством страниц


        // Выводим значения полей для обеих книг (по очереди: название, затем количество страниц)

    }
}

class Book {
    String bookTitle;
    int pageCount;

    Book(String BookTitle) {
        this.bookTitle = BookTitle;
        this.pageCount = 0;
    }

    Book(String BookTitle, int pageCount) {
        this.bookTitle = BookTitle;
        this.pageCount = pageCount;
    }

}
// "Форма" для книги: хранит название и количество страниц