package com.yahoo.cybertactics.aksdemo.controller;

import com.yahoo.cybertactics.aksdemo.dto.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
    @GetMapping
    public String hello(){
       return "the quick brown fox jumps over the lazy dog near the riverbanks";
   }

    @GetMapping("/test")
    public List<Person> getPersons(){

        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "john", 13));
        persons.add(new Person(2, "mark", 17));
        persons.add(new Person(3, "walter", 21));
        persons.add(new Person(4, "robert", 21));

        return persons;
   }
}