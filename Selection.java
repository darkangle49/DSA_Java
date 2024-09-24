import java.util.Scanner;

import static java.util.Collections.swap;

public class Selection {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Before sort");

        for(int x:a)
        {
            System.out.print(x+" ");
        }
        System.out.println("After sort");

        for(int i=0;i<n;i++)
        {int index=i;
            int min=a[i];
            for(int j=i;j<n;j++)
            {
                if(a[j]<min)
                {
                 min=a[j];
                 index=j;
                }
            }
            swap(a,i,index);
        }
        for(int x:a)
        {
            System.out.print(x+" ");
        }


    }

    private static void swap(int[] a, int i, int j) {

        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
