import java.util.Arrays;
import java.util.Scanner;

public class Knapsack {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int w[]=new int[n];

        int sum=0;

        for(int i=0;i<n;i++)
        {
            w[i]=sc.nextInt();
            sum+=w[i];
        }
        boolean possible[]=new boolean[sum+1];

        Arrays.fill(possible,false);

        possible[0]=true;

        for(int i=1;i<=n;i++)
        {
            for(int j=sum;j>=0;j--)
            {
                if(possible[j])
                {
                    possible[j+w[i-1]]=true;
                }
            }
        }

        for(int i=0;i<=sum;i++)
        {
                if(possible[i])
                {
                    System.out.print(i+" ");

                }

        }


    }
}
