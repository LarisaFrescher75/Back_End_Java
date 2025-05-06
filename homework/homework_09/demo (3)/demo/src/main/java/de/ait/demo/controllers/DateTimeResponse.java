package de.ait.demo.controllers;

import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
public class DateTimeResponse {

    private String date;
    private String time;
    private String iso;

    public DateTimeResponse() {
        LocalDateTime now = LocalDateTime.now();
        this.date = now.toLocalDate().toString();
        this.time = now.toLocalTime().withNano(0).toString();
        this.iso = now.toString();
    }

}

