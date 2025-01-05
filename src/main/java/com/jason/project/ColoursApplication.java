package com.jason.project;

import com.jason.project.services.ColourPrinter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoursApplication implements CommandLineRunner {

    private final ColourPrinter colourPrinter;

    public ColoursApplication(ColourPrinter colourPrinter) {
        this.colourPrinter = colourPrinter;
    }

    public static void main(String[] args) {
        SpringApplication.run(ColoursApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(colourPrinter.print());
    }
}
