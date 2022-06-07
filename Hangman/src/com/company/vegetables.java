package com.company;
import java.lang.Math;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class vegetables {

    List<String> veg = Files.readAllLines(Paths.get("/Users/lina/Desktop/CS/vegetables.txt"));

    String[] veglist = veg.toArray(new String[0]);

    int newNum;
    String newVeg;

    public vegetables() throws IOException {
        newNum = (int) (Math.random() * veglist.length);
        newVeg = veglist[newNum];
    }

    public String getVeg() {
        return newVeg;
    }
}
