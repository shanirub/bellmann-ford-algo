package com.company;

import java.util.ArrayList;

public class Graph {

    ArrayList<Kante> kanten; // Vektor von Kanten
    int numOfKnoten; // Zahl von Knoten

    public Graph() {
        kanten = new ArrayList<Kante>();
        numOfKnoten = 0;
    }

    public void addKante(Kante kante) {
        kanten.add(kante);
        numOfKnoten++;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "kanten=" + kanten +
                "numOfKnoten=" + numOfKnoten +
                '}';
    }
}
