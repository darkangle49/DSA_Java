import java.util.Scanner;
import java.util.Stack;

public class Nearest_Smaller_Element {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        Stack<int[]> st=new Stack<>();
        int res[]=new int[n];

        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && st.peek()[0]>a[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                res[i]=-1;
            }
            else
            {
                res[i]=st.peek()[1];
            }
            st.push(new int[]{a[i],i});

        }
        for(int i=0;i<n;i++)
        {
            System.out.print(res[i]+" ");
        }

    }
}
