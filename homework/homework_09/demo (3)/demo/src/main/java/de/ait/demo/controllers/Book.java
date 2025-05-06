package de.ait.demo.controllers;

public class Book {

    String name;
    String writer;
    int year;

    public Book(){}

    public Book(String name, String writer, int year) {
        this.name = name;
        this.writer = writer;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getWriter() {
        return writer;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", writer='" + writer + '\'' +
                ", year=" + year +
                '}';
    }
}
