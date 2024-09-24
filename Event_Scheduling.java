import java.util.*;
public class Event_Scheduling {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a[][]=new int[n][2];

        for(int i=0;i<n;i++)
        {
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }

        Arrays.sort(a,(x,y)->x[1]-y[1]);

        int end=a[0][1];
        int ans=1;

        for(int i=1;i<n;i++)
        {
            if(a[i][0]>end)
            {
                ans++;
                end=a[i][1];
            }

        }
        System.out.println(ans);

    }
}
