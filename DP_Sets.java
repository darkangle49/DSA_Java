import java.util.Scanner;

public class DP_Sets {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int k=sc.nextInt();

        int n=sc.nextInt();

        int price[][]=new int[k][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<k;j++)
            {
                price[j][i]=sc.nextInt();
            }
        }

        int[][] total = new int[1 << k][n];

        for (int x = 0; x < k; x++) {
            total[1 << x][0] = price[x][0];
        }
        for (int d = 1; d < n; d++) {
            for (int s = 0; s < (1 << k); s++) {
                total[s][d] = total[s][d - 1];
                for (int x = 0; x < k; x++) {
                    if ((s & (1 << x)) != 0) {
                        total[s][d] = Math.min(total[s][d], total[s ^ (1 << x)][d - 1] + price[x][d]);
                    }
                }
            }
        }
            System.out.println(total[(1 << k) - 1][n - 1]);


    }
}
