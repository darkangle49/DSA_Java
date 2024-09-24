import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LIS_BS {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        List<Integer> al=new ArrayList<>();
        int maxlen=0;


        al.add(a[0]);

        for(int i=1;i<n;i++)
        {
            if(a[i]>al.get(al.size()-1))
            {
                al.add(a[i]);
            }
            else
            {
                int low= Collections.binarySearch(al,a[i]);

                if(low<0)
                {
                    low=-(low+1);
                }
                al.set(low,a[i]);

            }
            for(int x:al)
            {
                System.out.print(x+" ");
            }
            System.out.println();

        }
        System.out.println(al.size());
    }
}
