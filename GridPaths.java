import java.util.Scanner;

public class GridPaths {
    static boolean grid[][];
    static int dr[]={-1,0,1,0};
    static int dc[]={0,1,0,-1};
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        grid=new boolean[n+2][n+2];

        for(int i=0;i<n+2;i++)
        {
            grid[i][0]=true;
            grid[0][i]=true;
            grid[i][n+1]=true;
            grid[n+1][i]=true;
        }

        ans=search(1,1,n,0);
        System.out.println(ans);
    }
    static int ans=0;
    public static int search(int i,int j,int n,int count)
    {

        if(grid[i][j-1] && grid[i][j+1] && !grid[i-1][j] && !grid[i+1][j])
        {
            return 0;
        }
        if(grid[i-1][j] && grid[i+1][j] && !grid[i][j+1] && !grid[i][j-1])
        {
            return 0;
        }

        if(i==n-1 && j==n-1)
        {
            if(count==n*n-1) {

                return 1;
            }
            return 0;
        }

        int res=0;
        grid[i][j]=true;

        for(int k=0;k<4;k++)
        {
            int n1=i+dr[k];
            int n2=j+dc[k];
            if(!grid[n1][n2])
            {
                res+=search(n1,n2,n,count+1);
            }
        }
        grid[i][j]=false;

        return res;


    }
}
