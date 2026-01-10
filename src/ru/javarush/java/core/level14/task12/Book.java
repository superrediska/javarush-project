package ru.javarush.java.core.level14.task12;

public class Book{
    private String bookTitle;
    private int numberOfPages;
    Book(){
        this.bookTitle = "Без названия";
        this.numberOfPages = 0;
    }
    Book(String bookTitle, int numberOfPage){
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPage;
    }public String getBookTitle() {
        return bookTitle;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
