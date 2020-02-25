package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Todo add read from file
 * Todo add vorgänger
 */
public class Main
{

    static int numOfKnoten = 9; // Zahl der Knoten
    static int numOfKanten = 15; // Zahl der Kanten
    static int[][] graph = new int[numOfKanten][3]; // Alle Kanten aus der Datei: 15 Zeile für 15 Kanten, 3 Spalten für u,v,w

    private static void readFile() {

    /*
            Graph Objekt erzeugen von Datei
    */

        File file = new File("Graph_BF2_1.txt");
        try {
            Scanner scanner = new Scanner(file);

            for (int i = 0; i < numOfKanten; i++) {
                graph[i][0] = scanner.nextInt();
                graph[i][1] = scanner.nextInt();
                graph[i][2] = scanner.nextInt();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        System.out.println(" Datei gelesen: ");
        for (int i = 0; i < numOfKanten; i++) {
            System.out.println("(" + graph[i][0] + ", " + graph[i][1] + ") = " + graph[i][2]);
        }

    }


    // The main function that finds shortest
// distances from src to all other vertices
// using Bellman-Ford algorithm. The function
// also detects negative weight cycle
// The row graph[i] represents i-th edge with
// three values u, v and w.
    private static void BellmanFord(int graph[][], int numOfKnoten, int numOfKanten,
                            int src)
    {
        // Initialize distance of all vertices as 0.
        int []dis = new int[numOfKnoten];
        for (int i = 0; i < numOfKnoten; i++)
            dis[i] = Integer.MAX_VALUE;

        // initialize distance of source as 0
        dis[src] = 0;

        // Relax all edges |numOfKnoten| - 1 times. A simple
        // shortest path from src to any other
        // vertex can have at-most |numOfKnoten| - 1 edges
        for (int i = 0; i < numOfKnoten - 1; i++)
        {

            for (int j = 0; j < numOfKanten; j++)
            {
                if (dis[graph[j][0]] + graph[j][2] < dis[graph[j][1]])
                    dis[graph[j][1]] = dis[graph[j][0]] + graph[j][2];
            }
        }

        // check for negative-weight cycles.
        // The above step guarantees shortest
        // distances if graph doesn't contain
        // negative weight cycle. If we get a
        // shorter path, then there is a cycle.
        for (int i = 0; i < numOfKanten; i++)
        {
            int x = graph[i][0];
            int y = graph[i][1];
            int weight = graph[i][2];
            if (dis[x] != Integer.MAX_VALUE &&
                    dis[x] + weight < dis[y])
                System.out.println("Graph contains negative"
                        +" weight cycle");
        }

        System.out.println("numOfKnotenertex Distance from Source");
        for (int i = 0; i < numOfKnoten; i++)
            System.out.println(i + "\t\t" + dis[i]);
    }

    public static void main(String[] args)
    {

        readFile();

        // numOfKantenvery edge has three values (u, v, w) where
        // the edge is from vertex u to v. And weight
        // of the edge is w.
                /*int graph[][] = { { 0, 1, -1 }, { 0, 2, 4 },
                { 1, 2, 3 }, { 1, 3, 2 },
                { 1, 4, 2 }, { 3, 2, 5 },
                { 3, 1, 1 }, { 4, 3, -3 } };*/

        //BellmanFord(graph, numOfKnoten, numOfKanten, 0);
    }
}
