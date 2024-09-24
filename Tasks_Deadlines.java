import java.util.Arrays;
import java.util.Scanner;

public class Tasks_Deadlines {
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
        Arrays.sort(a,(x,y)->x[0]-y[0]);

        int score=0;
        int start=0;

        for(int i=0;i<n;i++)
        {

            score+=a[i][1]-(start+a[i][0]);
            start+=a[i][0];


        }
        System.out.println(score);
    }
}
