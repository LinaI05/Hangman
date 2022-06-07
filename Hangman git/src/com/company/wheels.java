package com.company;
import java.lang.Math;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class wheels {

    List<String> wheel = Files.readAllLines(Paths.get("/Users/lina/Desktop/CS/wheels.txt"));

    String[] wheelList = wheel.toArray(new String[0]);

    int newNumbe;
    String newWheel;

    public wheels() throws IOException {
        newNumbe = (int) (Math.random() * wheelList.length);
        newWheel = wheelList[newNumbe];
    }

    public String getWheel() {
        return newWheel;
    }
}

