import java.util.*;

class Edge {
    int dest;

    public Edge(int dest) {
        this.dest = dest;
    }
}

public class Y_Tarjans_Algorithm_25 {
    public static void dfs(ArrayList<Edge> graph[], int curr, int par, boolean vis[], int
            dt[], int low[], int time) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (e.dest == par)
                continue;

            if (vis[e.dest]) {
                low[curr] = Math.min(low[curr], dt[e.dest]);
            } else {
                dfs(graph, e.dest, curr, vis, dt, low, time);
                low[curr] = Math.min(low[curr], low[e.dest]);
                if (dt[curr] < low[e.dest]) {
                    System.out.println("BRIDGE : " + curr + "---" + e.dest);
                }
            }
        }
    }

    public static void getBridge(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, vis, dt, low, time);
            }
        }
    }

    public static void main(String[] args) {
        // Sample Usage
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(1));
        graph[1].add(new Edge(0));
        graph[1].add(new Edge(2));
        graph[2].add(new Edge(1));
        graph[1].add(new Edge(3));
        graph[3].add(new Edge(1));

        getBridge(graph, V);
    }
}
