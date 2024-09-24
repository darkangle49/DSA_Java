import java.util.Scanner;

public class Knapsack_1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int weights[]=new int[n];
        int profits[]=new int[n];

        int x=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            weights[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            profits[i]=sc.nextInt();

        }

        int possible[][]=new int[n+1][x+1];


        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=x;j++)
            {
                // For base case
                if(i==0 || j==0)
                {
                    possible[i][j]=0;
                }
                else {
                    // Comparing out of bounds if it matches we can check whether we are going to get max profit including this or we have a better profit already
                    if (j - weights[i - 1] >= 0) {
                        possible[i][j] = Math.max(possible[i - 1][j - weights[i - 1]] + profits[i - 1], possible[i - 1][j]);
                    } else {
                        possible[i][j] = possible[i - 1][j];
                    }
                }


            }
        }
        System.out.println(possible[n][x]);

    }
}
