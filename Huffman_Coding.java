import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Huffman_Coding {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        String s=sc.next();

        int a[]=new int[26];

        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'a']++;
        }
        String alpha="abcdefghijklmnopqrstuvwxyz";


        PriorityQueue<Node> pq=new PriorityQueue<>((x,y)->x.count-y.count);


       for(int i=0;i<26;i++)
        {
            if(a[i]>0)
            {
                Node node=new Node();
                node.data=alpha.charAt(i);
                node.count=a[i];

                node.left=null;
                node.right=null;
                pq.add(node);

            }
        }

        Node root=null;
        while(pq.size()>1)
        {
            Node x=pq.peek();
            pq.poll();
            Node y=pq.peek();
            pq.poll();

            Node f=new Node();

            f.data='-';
            f.count=x.count+y.count;

            f.left=x;
            f.right=y;
            root=f;

            pq.add(f);

        }
        view(root,"");


    }
    public static void view(Node node,String s)
    {
        if(node.left==null && node.right==null && Character.isLetter(node.data))
        {
            System.out.println(node.data+" :"+s);
            return;
        }

        view(node.left,s+"0");
        view(node.right,s+"1");
    }

}
class Node{
    char data;
    int count;

    Node left;
    Node right;

}
