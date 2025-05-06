package de.ait.demo.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class DemoRestController {

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> getBook(){
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("QuietDon","Sholokhov",1928));
        bookList.add(new Book("NapoleonsConvoy","Rubina",2018));
        bookList.add(new Book("Lyubka","Rubina",2024));


        return bookList;
    }
    @RequestMapping(value = "/films", method = RequestMethod.GET)
    public  List<Film>  getFilm(){

        List<Film> filmList = new ArrayList<>();
        filmList.add(new Film("LegendNumber17","Mikhalkov",2012));
        filmList.add(new Film("Road","Fellini",1958));
        filmList.add(new Film("Duchess","SaulDibb",2008));

        return filmList;

    }


}
