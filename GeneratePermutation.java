import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeneratePermutation {
    static List<List<Integer>> allSets=new ArrayList<>();
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        List<Integer> al=new ArrayList<>();

        generate(n,al);
        for(List<Integer> x:allSets)
        {
            System.out.println("{");
            for(int y:x)
            {
                System.out.print(y+",");
            }
            System.out.print("}");
        }
    }

    public static void generate(int n,List<Integer> al)
    {
        if(n==al.size())
        {
            allSets.add(new ArrayList<>(al));
            return;

        }
        for(int i=0;i<n;i++)
        {
            if(al.contains(i))
            {
                continue;
            }
            al.add(i);
            generate(n,al);
            al.remove(al.size()-1);

        }
    }

}
