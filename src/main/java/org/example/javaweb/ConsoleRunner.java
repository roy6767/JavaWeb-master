package org.example.javaweb;

import org.example.javaweb.utils.DataSeeder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner {
    @Autowired
    private DataSeeder dataSeeder;
    @Override
    public void run(String... args) throws Exception {

        dataSeeder.Seed();
    }

}
