import java.util.Scanner;

public class Subarray_Sum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int l=0;
        int r=0;
        int sum=0;
        boolean flag=false;

        while(r<n)
        {
            sum+=a[r];
            while( sum>x && l<r)
            {

                sum-=a[l];

                l++;

            }
            if(sum==x)
            {
                flag=true;
                break;

            }
            r++;
        }
        if(flag)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }

    }
}
