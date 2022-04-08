package com.seannavery.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class HomeController {
    @RequestMapping("")
    public String index(){
    return "Welcome";
    }
    @RequestMapping("/today")
    public String hello(){
    return "Today you will find luck in all of your endeavors!";
    }
    @RequestMapping("/tomorrow")
    public String world(){
    return "Tomorrow, an opportunity will arise!";
    }
}