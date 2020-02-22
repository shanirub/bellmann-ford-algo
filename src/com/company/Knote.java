package com.company;

public class Knote {

    protected int v; // com.company.Knote Nummer
    protected int vor; // Vorgänger
    protected int dist; // Distanz von s (Startknote)
    protected boolean istStartknote;

    public Knote(int v, boolean  istStartknote) {
        this.v = v;
        this.istStartknote = istStartknote;
        vor = -1; // bedeutet es gibt noch keinen Vorgänger / unbestimmt Vorgänger
        dist = Integer.MAX_VALUE; // bedeutet unendlich (also max. Wert von Integer)
    }

    @Override
    public String toString() {
        return "Knote{" +
                "v=" + v +
                ", vor=" + vor +
                ", dist=" + dist +
                ", istStartknote=" + istStartknote +
                "}\n";
    }
}
