import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String args[])
    {
        List<Student> al=new ArrayList<Student>();

        al.add(new Student(97,"Akhil"));
        al.add(new Student(67,"John"));
        al.add(new Student(94,"Doe"));
        al.add(new Student(22,"Ethan"));
        al.add(new Student(52,"Sen"));

        Comparator<Student> c1=((Student a, Student b)->a.getName().compareTo(b.getName())) ;
        Comparator<Student> c2=((a,b)->a.getId()-b.getId());

        Collections.sort(al,c1);

        for(Student x: al)
        {
            System.out.println(x.toString());
        }

        System.out.println("Sort by ID");


        Collections.sort(al,c2);

        for(Student x: al)
        {
            System.out.println(x.toString());
        }



    }


}
  class Student{
    int id;
    String name;

    public Student(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String toString()
    {
        return id+" "+name;
    }

}
