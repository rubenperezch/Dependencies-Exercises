package com.greenfoxacademy.dependencieswebapp;

import com.greenfoxacademy.dependencieswebapp.Models.BlueColor;
import com.greenfoxacademy.dependencieswebapp.Models.MyColor;
import com.greenfoxacademy.dependencieswebapp.Models.RedColor;
import com.greenfoxacademy.dependencieswebapp.Service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesWebAppApplication implements CommandLineRunner {

    //Printer printer;
    MyColor myColor;
    BlueColor blueColor;

    /*@Autowired
    public DependenciesWebAppApplication(RedColor redColor) {
        this.redColor = redColor;
    }*/



    @Autowired
    public DependenciesWebAppApplication(MyColor myColor) {
        this.myColor = myColor;
    }

    public static void main(String[] args) {

        SpringApplication.run(DependenciesWebAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        myColor.printColor();

        //printer.log("Hello");
    }
}
