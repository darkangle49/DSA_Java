import java.util.Scanner;

public class Min_Max_Queries {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a[]=new int[n];
        int len=(int)(Math.log(n)/Math.log(2));
        int sparse[][]=new int[n][len];


        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sparse[i][0]=a[i];
        }
        int m=sc.nextInt();
        int q[][]=new int[m][2];

        for(int i=0;i<m;i++)
        {
            q[i][0]=sc.nextInt();
            q[i][1]=sc.nextInt();
        }


        int bin_log[]=new int[n];

        bin_log[0]=0;

        for(int i=2;i<n;i++)
        {
            bin_log[i]=bin_log[i/2]+1;
        }

       for(int j=1;j<len;j++)
       {
           for(int i=0;i-(1<<j)+1<n;i++)
           {
               sparse[i][j]=Math.min(sparse[i][j-1],sparse[i+(1<<j-1)][j-1]);
           }
       }
       int res[]=new int[m];

       for(int i=0;i<m;i++)
       {
           int l=q[i][0];
           int r=q[i][1];

           int x=r-l+1;

           int val=bin_log[x];

           res[i]=Math.min(sparse[l][val],sparse[r-(1<<val)+1][val]);

       }
       for(int i=0;i<n;i++)
       {
           System.out.print(res[i]+" ");
       }

    }
}
