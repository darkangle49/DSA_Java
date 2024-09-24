import java.util.*;

public class Sliding_Window_Minimum {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int w=sc.nextInt();

        Deque<Integer> q=new LinkedList<>();
        int res[]=new int[n-w+1];

        for(int i=0;i<n;i++)
        {
            while(!q.isEmpty() && q.peek()<i-w+1)
            {
                q.poll();
            }
            while(!q.isEmpty() && a[q.peekLast()]>a[i])
            {
                q.pollLast();
            }
            q.offer(i);
            if(i>=w-1)
            {
                res[i-w+1]=a[q.peek()];
            }

        }
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }


    }
}
