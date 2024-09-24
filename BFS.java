import java.util.*;

public class BFS {
    public static void main(String args[])
    {
        int vertices = 5;

        Graph graph = new Graph(vertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        graph.bfs(0);

    }
}
class Graph{
    int vertices;
    List<Integer>[] adj;

    public Graph(int vertices)
    {
        this.vertices=vertices;
        this.adj=new LinkedList[this.vertices];
        for(int i=0;i<vertices;i++)
        {
            adj[i]=new LinkedList<>();
        }

    }
    void addEdge(int u,int v)
    {
        adj[u].add(v);
    }

    void bfs(int s)
    {
        Queue<Integer> q=new LinkedList<>();
        q.offer(s);
        boolean visited[]=new boolean[vertices];
        visited[s]=true;

        while(!q.isEmpty())
        {
            int x=q.poll();

            System.out.print(x+"->");
            for(int neighbour:adj[x])
            {
                if(visited[neighbour])
                {
                    continue;
                }
                visited[neighbour]=true;
                q.add(neighbour);
            }
        }
    }}
