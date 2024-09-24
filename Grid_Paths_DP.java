import java.util.Scanner;

public class Grid_Paths_DP {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a[][]=new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }

        int dp[][]=new int[n+1][n+1];

        dp[0][0]=a[0][0];
        for(int i=1;i<=n;i++)
        {
            dp[i][0]=a[i][0]+dp[i-1][0];
            dp[0][i]=a[0][i]+dp[0][i-1];
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                dp[i][j]=a[i-1][j-1]+Math.max(dp[i-1][j],dp[i][j-1]);

            }
        }
        System.out.println(dp[n][n]);
    }

}
