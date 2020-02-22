package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Graph {

    ArrayList<Kante> kanten; // Vektor von Kanten
    int numOfKanten; // Zahl von Kanten

    public Graph() {
        kanten = new ArrayList<Kante>();
        numOfKanten = 0;
    }

    public void addKante(Kante kante) {
        kanten.add(kante);
        numOfKanten++;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "kanten=" + kanten +
                "Zahl der Kanten=" + numOfKanten;
    }
}
