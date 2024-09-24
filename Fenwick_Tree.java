import java.util.Arrays;
import java.util.Scanner;

public class Fenwick_Tree {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       int tree[]=new int[n+1];
        for (int i = 1; i <= n; i++) {
            tree[i] = a[i-1];
        }

        for(int i=1;i<n+1;i++)
        {
            int j=i+LSB(i);

            if(j<n+1)
            {
                tree[j]+=tree[i];
            }
        }

        System.out.println(compute_sum(5,tree));
    }
    public static int LSB(int n)
    {
        return n&-n;
    }
    public static int compute_sum(int i,int tree[])
    {
        int sum=0;
        while(i!=0)
        {
            sum+=tree[i];
            i=i-LSB(i);
        }
        return sum;
    }
    public static void update(int tree[],int x,int i,int n)
    {
        while(i<n)
        {
            tree[i]=tree[i]+x;
            i=i+LSB(i);
        }
    }
}
