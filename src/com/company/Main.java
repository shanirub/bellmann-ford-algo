package com.company;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        /*
        Graph Objekt erzeugen von Datei
         */
        Graph g = new Graph();

        Path path = FileSystems.getDefault().getPath("Graph_BF2_1.txt");
        try {
            Stream<String> lines = Files.lines(path);
            lines.forEach(s -> {
                String[] sa = s.split(" ");
                int v = Integer.parseInt(sa[0]);
                int u = Integer.parseInt(sa[1]);
                int w = Integer.parseInt(sa[2]);

                Kante k = new Kante(v, u, w);

                g.addKante(k);
            });
            lines.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(g); // Graph Objekt ausdrucken


    }
}
