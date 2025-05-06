package de.ait.demo.controllers;

public class Film {
    String name;
    String producer;
    int year;

    public Film() {}

    public Film(String name, String producer, int year) {
        this.name = name;
        this.producer = producer;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                '}';
    }
}
