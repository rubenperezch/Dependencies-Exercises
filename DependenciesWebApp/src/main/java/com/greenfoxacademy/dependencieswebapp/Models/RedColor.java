package com.greenfoxacademy.dependencieswebapp.Models;

import com.greenfoxacademy.dependencieswebapp.Service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class RedColor implements MyColor {
    /*@Override
    public void printColor() {
        System.out.println("RED COLOR");
    }*/

    Printer printer;

    @Autowired
    public RedColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("RED COLOR");
    }
}
