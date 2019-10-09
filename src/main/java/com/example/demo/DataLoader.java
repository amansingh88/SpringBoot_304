package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{
    @Autowired
    TodoRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Todo todo;
        todo=new Todo("Toyota", "Camry", "2018");
        repository.save(todo);

        todo= new Todo("BMW", "528i", "1997");
        repository.save(todo);

        todo= new Todo("Hyundai", "Santro", "2015");
        repository.save(todo);
    }
}