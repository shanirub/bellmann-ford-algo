package com.company;

import java.util.ArrayList;

public class Graph {

    ArrayList<Kante> kanten; // Vektor von Kanten
    ArrayList<Knote> knoten; // Vektor von Knoten
    int numOfKnoten; // Zahl von Knoten
    int numOfKanten; // Zahl von Kanten

    public Graph() {
        kanten = new ArrayList<Kante>();
        numOfKanten = 0;
        knoten = new ArrayList<Knote>();
        numOfKnoten = 0;
    }

    public void addKante(Kante kante) {
        kanten.add(kante);
        numOfKanten++;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "kanten=" + kanten +
                "Zahl der Kanten=" + numOfKanten +
                "\n" + "knoten=" + knoten +
                "\nZahl der Knoten=" + numOfKnoten;
    }
}
