import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MeetInTheMiddle {
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


        sums(0,n/2,a,0);
        List<Integer> res1=new ArrayList<>(sub);

        sub.clear();
        sums(n/2,n,a,0);

        List<Integer> res2=new ArrayList<>(sub);


        for(int y:res1)
        {
            System.out.print(y+" ");
        }
        System.out.println();

        for(int y:res2)
        {
            System.out.print(y+" ");
        }
        Collections.sort(res1);
        Collections.sort(res2);

        System.out.println(merge(res1,res2,n));


    }
    static List<Integer> sub=new ArrayList<>();


    public static void sums(int i,int n,int a[],int sum)
    {
        if(i==n)
        {
            sub.add(sum);

            return;
        }


        sums(i+1,n,a,sum+a[i]);
        ;
        sums(i+1,n,a,sum);

    }
    public static boolean merge(List<Integer> res1,List<Integer> res2,int x)
    {

        int i=0;
        int j=res2.size()-1;

        while(i<res1.size() && j>=0)
        {
            int sum=res1.get(i)+res2.get(j);

            if(sum==x)
            {
                return true;
            }
            else
            {
                if(sum>x)
                {
                    j--;
                }
                else
                {
                    i++;
                }
            }
        }
        return false;


    }

}
