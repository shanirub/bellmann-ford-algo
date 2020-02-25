package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Todo add vorgänger
 */
public class Main
{

    static int numOfKnoten = 10; // Zahl der Knoten, annehmend von Dateien.
    static int numOfKanten = 15; // Zahl der Kanten, annehmend von Dateien.
    static int[][] graph = new int[numOfKanten][3]; // Alle Kanten aus der Datei: 15 Zeile für 15 Kanten, 3 Spalten für u,v,w

    /**
     * Kanten von der Datei in Array lesen
     */
    private static void readFile() {
        File file = new File("Graph_BF2_1.txt");
        try {
            Scanner scanner = new Scanner(file);

            for (int i = 0; i < numOfKanten; i++) {
                graph[i][0] = scanner.nextInt();
                graph[i][1] = scanner.nextInt();
                graph[i][2] = scanner.nextInt();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(" Error in reading file");
            ex.printStackTrace();
        }
        System.out.println("\n\n\t\t---Datei gelesen---");
        for (int i = 0; i < numOfKanten; i++) {
            System.out.println("(" + graph[i][0] + ", " + graph[i][1] + ") = " + graph[i][2]);
        }
    }

    /**
     * Belmann-Ford Algo.
     * Annehmend: 0 ist Startknote.
     *
     */
    private static void bellmannFord()
    {
        int dist[] = new int[numOfKnoten];
        int vor[] = new int[numOfKnoten];

        // Init von dist(Distanz) und vor(Vorgänger) Arrays
        for (int i = 0; i < numOfKnoten; i++) {
            dist[i] = Integer.MAX_VALUE; // max Wert von Integer als unendlich
            vor[i] = -1; // kein Vorgänger als -1
        }
        dist[0] = 0; // Distanz für startknote als 0

        // erster Lauf für alle Kanten (numOfKanten -1)
        for (int i = 0; i < numOfKanten - 1; i++)
        {
            for (int j = 0; j < numOfKanten; j++)
            {
                /**
                 * u, v, w
                 * if dist(v) > dist(u) + w(u, v)
                 * then dist(v) = dist(u) + w(u, v) und vor(v) = u
                 */
                int u = graph[j][0];
                int v = graph[j][1];
                int w = graph[j][2];

                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    vor[v] = u;
                }

            }
        }

        // letzter Lauf zu überprüfen, ob es negative Zyklen gibt.
        // Wenn wir noch einen kürzeren Weg bekommen, bedeutet es, es gibt einen negativen Zyklus.
        for (int i = 0; i < numOfKanten; i++)
        {
            int x = graph[i][0];
            int y = graph[i][1];
            int weight = graph[i][2];
            if (dist[x] != Integer.MAX_VALUE && dist[x] + weight < dist[y])
                System.out.println(" Graph hat einen negativen Zyklus.");
        }

        System.out.println("\n\n\t\t---Ergebnisse---");
        for (int i = 0; i < numOfKnoten; i++)
            System.out.println(" Knote: " + i + "\tDistanz: " + dist[i] + "\tVorgänger: " + vor[i]);
    }

    /**
     * main Methode
     */
    public static void main(String[] args)
    {
        readFile();     // Methode um die Datei zu lesen
        bellmannFord(); // Methode um den Algo auszuführen
    }
}
