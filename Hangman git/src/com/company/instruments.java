package com.company;
import java.lang.Math;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class instruments {

    List<String> inst = Files.readAllLines(Paths.get("/Users/lina/Desktop/CS/instruments.txt"));

    String[] instlist = inst.toArray(new String[0]);

    int newNum2;
    String newInst;

    public instruments() throws IOException {
        newNum2 = (int) (Math.random() * instlist.length);
        newInst = instlist[newNum2];
    }

    public String getInst() {
        return newInst;
    }
}
