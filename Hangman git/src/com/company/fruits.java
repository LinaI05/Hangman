package com.company;
import java.lang.Math;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class fruits {
    List<String> fruit = Files.readAllLines(Paths.get("/Users/lina/Desktop/CS/fruits.txt"));

    String[] fruitList = fruit.toArray(new String[0]);

    int newNum1;
    String newFruit;

    public fruits() throws IOException {
        newNum1 = (int) (Math.random() * fruitList.length);
        newFruit = fruitList[newNum1];
    }

    public String getFruit() {
        return newFruit;
    }
}
