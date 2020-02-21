package com.company;


public class Kante {
    protected int v, u, w;

    public Kante(int v, int u, int w) {
        this.v = v; // erste Knote
        this.u = u; // zweite Knote
        this.w = w; // Gewicht
    }

    @Override
    public String toString() {
        return "Kante{" +
                "v=" + v +
                ", u=" + u +
                ", w=" + w +
                "}\n";
    }
}
