package Graph;
import java.util.*;
//Print number of islands in a graph (or number of connected components in a graph).
class Graph4 {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void BFS(ArrayList<ArrayList<Integer>> adj,int s, boolean[] visited)
    {
        Queue<Integer> q=new LinkedList<>();

        visited[s] = true;
        q.add(s);

        while(q.isEmpty()==false)
        {
            int u = q.poll();

            for(int v:adj.get(u)){
                if(visited[v]==false){
                    visited[v]=true;
                    q.add(v);
                }
            }
        }
    }

    static int BFSDin(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] visited=new boolean[V];int count=0;
        for(int i = 0; i < V; i++)
            visited[i] = false;
        for(int i=0;i<V;i++){
            if(visited[i]==false)
            {BFS(adj,i,visited);count++;}
        }
        return count;
    }

    public static void main(String[] args)
    {
        int V = 7;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,4,5);
        addEdge(adj,5,6);
        addEdge(adj,4,6);

        System.out.print("Number of islands: "+BFSDin(adj,V));
    }
}
