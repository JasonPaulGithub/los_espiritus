package com.jason.project.services.impl;

import com.jason.project.services.BluePrinter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class EnglishBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "blue";
    }
}
