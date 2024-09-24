import java.util.Scanner;

public class BackTrackingN_Queens {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        boolean column[]=new boolean[n];
        boolean diag1[]=new boolean[2*n];
        boolean diag2[]=new boolean[2*n];



        search(column,diag1,diag2,0,n);

        System.out.println(ans);



    }
    static int ans=0;
    public static void search(boolean column[],boolean diag1[],boolean diag2[],int x,int n)
    {
        if(x==n)
        {
            ans++;
            return;

        }
        for(int i=0;i<n;i++)
        {
            if(column[i] || diag1[i+x] || diag2[n-1+i-x])
            {
                continue;

            }
            column[i]=diag1[i+x]=diag2[n-1+i-x]=true;
            search(column,diag1,diag2,x+1,n);
            column[i]=diag1[i+x]=diag2[n-1+i-x]=false;


        }

    }
}
