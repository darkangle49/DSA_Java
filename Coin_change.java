import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Coin_change {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int coins[]=new int[n];
        for(int i=0;i<n;i++)
        {
            coins[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int memo[]=new int[target+1];
        Arrays.fill(memo,Integer.MAX_VALUE);
        //int ans=solve(coins,target,memo);

        memo[0]=0;

        for(int i=0;i<target+1;i++)
        {
            for(int c:coins)
            {
                if(i-c>=0)
                {
                    memo[i]=Math.min(memo[i],1+memo[i-c]);
                }
            }
        }
        int ans=memo[target];



        System.out.println(ans);
    }
    public static int solve(int coins[],int target,int memo[])
    {
        if(target<0)
        {
            return Integer.MAX_VALUE;
        }
        if(target==0)
        {
            return 0;
        }
        if(memo[target]!=Integer.MAX_VALUE)
        {
            return memo[target];
        }
        int min=Integer.MAX_VALUE;
        int res=0;
        for(int c:coins)
        {

            res=solve(coins, target - c, memo);

            if(res!=Integer.MAX_VALUE) {
                min = Math.min(min,res+1);
            }
        }
        memo[target]=min;

        return min;
    }
}
