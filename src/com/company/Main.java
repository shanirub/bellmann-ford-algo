package com.company;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    // Datei lesen und ein Graph Objekt erstellen
    public void readFile() {
        // 1. open file for reading
        // 2. read Kante until endline REPEAT
        // 3. finish reading when EOF
        // use FileInputStream's readLine() method to read and parse
        // the returned String to int using Integer.parseInt() method.

    }

    public static void main(String[] args) {

        Path path = FileSystems.getDefault().getPath("Graph_BF2_1.txt");
        try {
            // Files.lines(path, StandardCharsets.UTF_8).forEach();
            // returns lines. for each line -> make an array -> create a new Kante object.

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
