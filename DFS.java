import java.util.ArrayList;
import java.util.List;

public class DFS {

   static boolean visited[];
   static List<List<Integer>> adj;
    public static void main(String args[])
    {
        int n=5;

        adj=new ArrayList<>(n);

        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        visited=new boolean[n];
        addEdge(1,2);
        addEdge(2,3);
        addEdge(2,5);
        addEdge(3,5);
        addEdge(1,4);

        dfs(1);

    }
    public static void dfs(int s)
    {
        if(visited[s-1])
        {
            return;
        }
        visited[s-1]=true;
        System.out.print(s+"->");

        for(int x:adj.get(s-1))
        {

            dfs(x);
        }
    }
    public static void addEdge(int u,int v)
    {
        adj.get(u-1).add(v);
    }
}
