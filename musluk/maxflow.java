package musluk;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.LinkedList;

public class maxflow {

    public static int V = 4;    
    public static int pathlar[][] =new int[50][3];
    public static int pathlarsayac=0;

    boolean bfs(int rGraph[][], int s, int t, int parent[]) {

        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; ++i) {
            visited[i] = false;
        }


        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(s);
        visited[s] = true;
        parent[s] = -1;


        while (queue.size() != 0) {
            int u = queue.poll();

            for (int v = 0; v < V; v++) {
                if (visited[v] == false && rGraph[u][v] > 0) {
                    queue.add(v);
                    parent[v] = u;
                    visited[v] = true;
                }
            }
        }


        return (visited[t] == true);
    }


    int fordFulkerson(int graph[][], int s, int t) {
        int u, v;

 
        int rGraph[][] = new int[V][V];
        int cikti[][] = new int[V][V];

        for (u = 0; u < V; u++) {
            for (v = 0; v < V; v++) {
                rGraph[u][v] = graph[u][v];
            }
        }

        int parent[] = new int[V];

        int max_flow = 0;  

        
        
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 3; j++) {
                pathlar[i][j]=0;
                
            }
            
        }

        while (bfs(rGraph, s, t, parent)) {

            int path_flow = Integer.MAX_VALUE;
            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                path_flow = Math.min(path_flow, rGraph[u][v]);

            }

            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                rGraph[u][v] -= path_flow;
                rGraph[v][u] += path_flow;
                System.out.println(" nereden:"+u+" nereye: "+v+" kac gittigi: "+path_flow);
                pathlar[pathlarsayac][0]=u;
                pathlar[pathlarsayac][1]=v;
                pathlar[pathlarsayac][2]=path_flow;
                pathlarsayac++;
               
            }

            for (int i = 0; i < graph.length; i++) {
                for (int j = 0; j < graph.length; j++) {

                    cikti[i][j] = rGraph[i][j];
                }
            }

            max_flow += path_flow;
        }


        for (int i = 0; i < rGraph.length; i++) {
            for (int j = i; j < rGraph.length; j++) {
                cikti[i][j] = 0;
            }
        }
       
        

        /*   for (int i = 0; i < pathlar.size(); i++) {
             System.out.println("patlarrr: "+i +" "+pathlar.get(i));            
        }*/

        return max_flow;
    }

}
