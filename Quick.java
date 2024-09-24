import java.util.*;

import static java.util.Collections.swap;

public class Quick {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }



        quicksort(a,0,n);

        for(int x:a)
        {
            System.out.print(x+" ");
        }


    }
    public static void quicksort(int a[], int i, int j)
    {
        if(i>=j-1)
        {
            return;
        }
        int pivot=a[j-1];
        int i1=0;

        for(int k=0;k<j;k++)
        {
            if(a[k]<pivot)
            {
                swap(a,k,i1);
                i1++;
            }
        }
        swap(a,i1,j-1);
        quicksort(a,0,i1);
        quicksort(a,i1,j);
    }

    private static void swap(int[] a, int i, int j) {

        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
}
