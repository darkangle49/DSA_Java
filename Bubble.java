import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {

        //Bubble sort
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

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    /*int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;*/
                    swap(a,j,j+1);
                }
            }
        }
        for(int x:a)
        {
            System.out.print(x+" ");
        }


    }

    public static  void swap(int arr[],int i, int i1) {

        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}