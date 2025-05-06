package de.ait.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NowController {

    @GetMapping("/now")
    public DateTimeResponse getCurrentDateTime() {
        return new DateTimeResponse();
    }
}
