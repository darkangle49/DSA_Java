import java.util.Scanner;

public class Segment_tree {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int tree[]=new int[2*n];

        for(int i=0;i<n;i++) {
            add(tree, i, n,a[i]);
        }

        for(int i=0;i<2*n;i++)
        {
            System.out.print(tree[i]+" ");
        }
        System.out.println(sum(1,5,tree,n));
    }
    public static void add(int tree[],int j,int n,int x)
    {
        j+=n;
        tree[j]+=x;



            for (j /= 2; j >= 1; j /= 2) {
                tree[j] = tree[2 * j] + tree[2 * j + 1];
            }

    }
    public static int sum(int a,int b,int tree[],int n)
    {
        int ans=0;
        a+=n;
        b+=n;
        while(a<=b)
        {
            if(a%2==1)
            {
                ans+=tree[a++];
            }
            if(b%2==0)
            {
                ans+=tree[b--];
            }
            a=a/2;
            b=b/2;
        }
        return ans;
    }
}
