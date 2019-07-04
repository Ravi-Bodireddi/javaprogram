import java.util.*;

public class removeduplicates{
    public static void main(String args[])
    {
       String arr[]={"ravi","abhi","aneeq","abhi","VASU","vasu"};
       ArrayList<String>arr1=new ArrayList<String>();
       for(int i=0;i<arr.length;i++)
       {
           arr1.add(arr[i]);
       }
       LinkedHashSet <String>set=new LinkedHashSet<String>(arr1);

      ArrayList<String>sol=new ArrayList<String>(set);
      System.out.println(sol);

       

    }

}