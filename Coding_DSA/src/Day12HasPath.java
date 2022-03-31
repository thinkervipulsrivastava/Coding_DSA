import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. You are given a graph, a src vertex and a destination vertex.
 * 2. You are required to find if a path exists between src and dest. If it does, print true
 *      otherwise print false.
 * Input Format
 * Input has been managed for you
 * Output Format
 * true if path exists, false otherwise
 * Constraints
 * None
 * Sample Input
 * 7
 * 8
 * 0 1 10
 * 1 2 10
 * 2 3 10
 * 0 3 10
 * 3 4 10
 * 4 5 10
 * 5 6 10
 * 4 6 10
 * 0
 * 6
 * Sample Output
 * true
 */
public class Day12HasPath {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void main (String [] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int vertex = Integer.parseInt(br.readLine());
            ArrayList<Edge>[] graph = new ArrayList[vertex];
            for (int i = 0; i < vertex; i++) {
                graph[i] = new ArrayList<>();
            }

            int edges = Integer.parseInt(br.readLine());
            for (int i = 0; i < edges; i ++) {
                String [] parts = br.readLine ().split(" ");
                int v1 = Integer.parseInt (parts [0]);
                int v2 = Integer.parseInt (parts [1]);
                int wt = Integer.parseInt (parts [3]);
                graph [v1].add (new Edge (v1, v2, wt));
                graph [v2].add (new Edge (v2, v1, wt));
            }
            int src = Integer.parseInt (br.readLine());
            int dest = Integer.parseInt  (br.readLine());

            boolean [] visited = new boolean[vertex];
            boolean flag = hasPath (graph, src, dest, visited);
            System.out.println (flag);
        } catch (Exception e) {

        }
    }

    public  static boolean hasPath (ArrayList <Edge> [] graph, int src, int dest, boolean[] visited) {
        boolean nbrHasPath = false;
        if (src == dest) {
            return true;
        }
        visited [src] = true;
        for (Edge e : graph [src]) {
            if (!visited [e.nbr])
               nbrHasPath  = hasPath (graph, e.nbr, dest, visited);
            if (nbrHasPath)
                return true;
        }
        return  false;
    }


}
