import java.util.Scanner;

public class Edit_Distance {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        String s1=sc.next();
        String s2=sc.next();

        int n1=s1.length();
        int n2=s2.length();

        int dp[][]=new int[n1+1][n2+1];

        for(int i=0;i<=n1;i++)
        {
            for(int j=0;j<=n2;j++)
            {
                if(i==0 && j==0)
                {
                    dp[i][j]=0;
                }
                else if(i==0 || j==0){
                    if(i==0)
                    {
                        dp[i][j]=j;
                    }
                    else if(j==0)
                    {
                        dp[i][j]=i;
                    }
                }
                else
                {
                    dp[i][j]=Math.min(dp[i-1][j]+1,Math.min(dp[i][j-1]+1,dp[i-1][j-1]+cost(s1.charAt(i-1),s2.charAt(j-1))));
                }
            }
        }

        for(int i=0;i<=n1;i++)
        {
            for(int j=0;j<=n2;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static int cost(char a,char b)
    {
        if(a==b)
        {
            return 0;
        }
        return 1;
    }
}
