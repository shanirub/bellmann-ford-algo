package com.company;

import java.util.ArrayList;

public class Algo {

    static ArrayList<Knote> knoten; // Vektor von Knoten
    static int numOfKnoten; // Zahl von Knoten

    // init
    private static void init() {
        Knote knote;
        numOfKnoten = 9;
        knoten = new ArrayList<Knote>();

        // Startknote
        knote = new Knote(0);
        knote.dist = 0;
        knoten.add(knote);

        // die nächste 8 Knoten
        for (int i = 1; i < numOfKnoten; i++) {
            knote = new Knote(i);
            knoten.add(knote);
        }

        System.out.println(knoten);
    }

    // iteration
    private static void iteration() {

    }

    // noch eine iteration, um die Bedienung zu überprüfen
    private static void bedienungIteration() {

    }

    // die kürzeste Wege ausdrucken
    private static void endPrint() {

    }

    public static void runAlgo(Graph graph) {

        init();

    }

}
