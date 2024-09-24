import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeneratingSubset {
   static  List<List<Integer>> subset=new ArrayList<>();
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> al=new ArrayList<>();

        generate(0,n,al);

        for(List<Integer> x:subset)
        {
            System.out.print("{");
            for(int y:x)
            {
                System.out.print(y+",");
            }
            System.out.print("}");
        }

    }
    public static void generate(int i,int n,List<Integer> al)
    {
        if(i==n)
        {
            subset.add(new ArrayList<>(al));
            return ;
        }

        al.add(i);

        generate(i+1,n,al);

       al.remove(al.size()-1);

        generate(i+1,n,al);



    }

}
