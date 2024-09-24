import java.util.*;
public class Merge {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }


        divide(a,0,n-1);
        for(int x:a)
        {
            System.out.print(x+" ");
        }

    }

   private static void divide(int[] a, int i, int i1) {

        if(i==i1)
        {
            return;
        }

        int mid=(i+i1)/2;

        divide(a,i,mid);
        divide(a,mid+1,i1);
        merge(a,i,mid+1,mid+1,i1+1);

    }

    private static void  merge(int a[],int l1,int r1,int l2, int r2)
    {
        int i=0;
        int temp[]=new int[r2-l1];
        int le=l1;


        while(l1<r1 && l2<r2)
        {
            if(a[l1]<a[l2])
            {
                temp[i]=a[l1];
                i++;
                l1++;

            }
            else
            {
                if(a[l1]>a[l2]) {
                    temp[i] = a[l2];
                    i++;
                    l2++;
                }
                else
                {
                    temp[i]=a[l1];
                    i++;
                    temp[i]=a[l2];
                    i++;
                    l1++;
                    l2++;
                }
            }
        }
        while(l1<r1)
        {
            temp[i]=a[l1];
            l1++;
            i++;
        }
        while(l2<r2)
        {
            temp[i]=a[l2];
            l2++;
            i++;
        }

        for(int j=0;j<temp.length;j++)
        {
            a[j+le]=temp[j];
        }


    }
}
