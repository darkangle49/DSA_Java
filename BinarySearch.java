import java.util.*;
public class BinarySearch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println(binarySearch(a,0,n-1,10));



    }
    public static int binarySearch(int a[],int l,int r,int key)
    {
        while(l<=r)
        {
            int mid=(l+r)/2;

            if(a[mid]==key)
            {
                return mid;
            }
            else
            {
                if(key>a[mid])
                {
                    l=mid+1;
                }
                else
                {
                    r=mid-1;
                }
            }

        }
        return -1;
    }
}
