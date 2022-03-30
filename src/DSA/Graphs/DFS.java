package DSA.Graphs;

import java.util.Arrays;
import java.util.LinkedList;

// Time complexity: O(V + E), Space Complexity: O(V)
public class DFS {
    static class Graph {
        int V;
        LinkedList<Integer> adj[];

        public Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }

        void addEdge(int v, int w) {
            adj[v].add(w);
        }

        @Override
        public String toString() {
            return "Graph{" +
                    "V=" + V +
                    ", adj=" + Arrays.toString(adj) +
                    '}';
        }

        void DFSUtil(int v, boolean[] visited) {
            // Mark the current node as visited and print it
            visited[v] = true;
            System.out.print(v + " ");

            // Recur for all the vertices adjacent to this
            // vertex
            for (int n : adj[v]) {
                if (!visited[n])
                    DFSUtil(n, visited);
            }
        }

        // The function to do DFS traversal.
        // It uses recursive
        // DFSUtil()
        void DFS(int v) {
            // Mark all the vertices as
            // not visited(set as
            // false by default in java)
            boolean[] visited = new boolean[V];

            // Call the recursive helper
            // function to print DFS
            // traversal
            DFSUtil(v, visited);
        }
    }

    public static void main(String args[]) {
        DFS.Graph g = new DFS.Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(g.toString());
        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        g.DFS(2);
    }
}
