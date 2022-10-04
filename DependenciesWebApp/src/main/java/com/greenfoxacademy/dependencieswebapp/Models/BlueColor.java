package com.greenfoxacademy.dependencieswebapp.Models;

import com.greenfoxacademy.dependencieswebapp.Service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor{

    /*@Override
    public void printColor() {
    System.out.println("BLUE COLOR");
    }*/
    Printer printer;
    @Autowired
    public BlueColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("BLUE COLOR");
    }
}
