import java.util.Scanner;

public class Coins_CountingWays {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
        int target=sc.nextInt();
        int memo[]=new int[target+1];
        memo[0]=1;

        for(int i=0;i<=target;i++)
        {
            for(int x:a)
            {
                if(i-x>=0) {
                    memo[i] += memo[i - x];
                }

            }
        }
        System.out.println(memo[target]);
    }
}
