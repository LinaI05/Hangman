package com.company;
import java.lang.Math;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class ts {

    List<String> tay = Files.readAllLines(Paths.get("/Users/lina/Desktop/CS/TS Names.txt"));

    String[] taylist = tay.toArray(new String[0]);

    int newNumb;
    String newTay;

    public ts() throws IOException {
        newNumb = (int) (Math.random() * taylist.length);
        newTay = taylist[newNumb];
    }

    public String getTay() {

        return newTay;
    }
}
