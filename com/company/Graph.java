package com.company;

import java.util.HashMap;
import java.util.LinkedList;
public class Graph {
    static class Edge {
        char source;
        char destination;
        int weight;

        public Edge(char source, char destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph1 {
        int vertices;
        LinkedList<Edge>[] adjacencylist;
         HashMap<Character,Integer> verticesMap=new HashMap<>();


        Graph1(int vertices) {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
            //initialize adjacency lists for all the vertices
            char a='A';
            for (int i = 0; i < vertices; i++) {
                verticesMap.put(a,i);
                adjacencylist[i] = new LinkedList<>();
                a++;
            }
        }

        public void addEgde(char source, char destination, int weight) {
            Edge edge = new Edge(source, destination, weight);

          //  Edge edge1=new Edge(destination,source,weight);  // for undirected
            adjacencylist[verticesMap.get(source)].addFirst(edge);

           //adjacencylist[verticesMap.get(destination)].addFirst(edge1); //for undirected

        }
        public void dfsrecursive(Character v, int[] visited)
        {
            visited[verticesMap.get(v)]=1;
            LinkedList<Edge> allNeighbors = adjacencylist[verticesMap.get(v)];
            for(Edge edge:allNeighbors)
            {
                if(visited[verticesMap.get(edge.destination)]==0)
                {
                   // System.out.println(edge.source+"...."+edge.destination);
                    dfsrecursive(edge.destination,visited);
                }

            }
        }
        public void dfs(Character s)
        {
          //  node.visit();
           // System.out.print(node.name + " ");


            LinkedList<Edge> allNeighbors = adjacencylist[verticesMap.get(s)];

            int[] visited=new int[4];

            for(Character v:verticesMap.keySet())
            {
                if(visited[verticesMap.get(v)]==0)
                {
                    dfsrecursive(v,visited);
                }
            }
            if (allNeighbors == null)
                return;
            for(Edge edge:allNeighbors)
            {


            }
        }

        public void printGraph() {
            for (int i = 0; i < vertices; i++)
            {
                LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j < list.size(); j++) {
                    System.out.println(i+" "+j);
                    System.out.println("vertex-" + list.get(j).source + " is connected to " +
                            list.get(j).destination + " with weight " + list.get(j).weight);
                }
            }



        }

        public static void main(String[] args) {
            int vertices = 4;
            Graph1 graph = new Graph1(vertices);
            graph.addEgde('A', 'B', 1);
            graph.addEgde('B', 'C', 3);
            graph.addEgde('A', 'C', 2);
            graph.addEgde('B','D',3);

          //graph.printGraph();
        graph.dfs('A');
        }
    }
}