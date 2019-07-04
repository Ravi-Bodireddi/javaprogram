
import java.util.*;
class anagrampalindrome {
  public static boolean MET(String str) {
      /* write your solution here */

      HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
      for(int i=0;i<str.length();i++)
      {
          char a=str.charAt(i);
          if(hm.get(a)!=null)
          {
              int b=hm.get(a);
              b++;
              hm.put(a,b);
          }
          else{
              hm.put(a,1);
          }
      }
      int flag=0;
      for(Map.Entry<Character,Integer>map:hm.entrySet())
      {
          int val=map.getValue();
          if(val%2==1)
          {
              if(flag==1)
              return false;
              flag=1;
          }

      }
     return true;


  }

public static void main(String args[])
{
    System.out.println(MET("abbcccdd"));
}
}