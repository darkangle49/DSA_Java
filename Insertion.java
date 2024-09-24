import java.util.*;

import static java.util.Collections.swap;

public class Insertion {
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

        for(int i=1;i<n;i++)
        {
            int j=i-1;
            int val=a[i];

            while(j>=0 && a[j]>val)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=val;

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
