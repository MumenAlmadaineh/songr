package com.example.songr.hello.controller;

import com.example.songr.hello.model.Album;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.awt.*;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/hello")
    void helloEndPoint(){
        System.out.println("Hello, World");
    }

    @GetMapping("/capitalize/hello")
    String capitalizeHelloEndPoint(){
        return "capitalize_hello";
    }

    // To return the new object as json on html page.
    @ResponseBody
    @GetMapping("/albums")
    List<Album> album(){
        return List.of(new Album("album title 1",
                        "album artist 1",
                        "album song count 1",
                        "album length 1",
                        "album image url 1"),

        new Album("album title 2",
                "album artist 2",
                "album song count 2",
                "album length 2",
                "album image url 2"),

        new Album("album title 3",
                "album artist 3",
                "album song count 3",
                "album length 3",
                "album image url 3"));
    }
}
