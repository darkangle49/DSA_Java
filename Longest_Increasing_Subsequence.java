import java.util.Arrays;
import java.util.Scanner;

public class Longest_Increasing_Subsequence {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int dp[]=new int[n];

        Arrays.fill(dp,1);
        int maxlen=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[i]>a[j])
                {
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
            maxlen=Math.max(maxlen,dp[i]);
        }

        // int ans= solve(a,-1,0,0);

        System.out.println(maxlen);
    }
    public static int solve(int a[], int prev, int curr,int ans)
    {
        int take=0;
        if(curr==a.length)

        {
            return ans;
        }

        if(prev==-1 || a[prev]<a[curr])
        {
            take=solve(a,curr,curr+1,ans+1);
        }

        int dont=solve(a,prev,curr+1,ans);

        return Math.max(take,dont);

    }
}
