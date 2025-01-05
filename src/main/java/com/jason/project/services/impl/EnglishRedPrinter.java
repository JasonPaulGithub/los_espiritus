package com.jason.project.services.impl;

import com.jason.project.services.RedPrinter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class EnglishRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "red";
    }
}
