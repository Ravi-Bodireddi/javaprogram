import java.util.*;
public class program{
    public static void main(String args[])
    {
         String s="{<{}{{()}}> ( { } ) }";
        int flag=0;
        int end=0;
        int count=0;
        if(s.charAt(s.length()-1)!='}'||s.charAt(0)!='{')
        {
            System.out.println("Compliation Errors");
            return;
        }
       for(int i=1;i<s.length()-1;i++)
       {
            if(s.charAt(i)=='<')
            {
                if(flag!=0)
                {System.out.println("Compilation Errors");return;}
                
                for(int j=i+1;j<s.length()-1;j++)
                {
                    if(s.charAt(j)=='>'){
                    end=j;
                    break;
                    }
                }
                if(end==0)
                {System.out.println("Compilation Errors");return;}
                for(int j=i+1;j<end;j++)
                {
                    if(s.charAt(j)=='(')
                    {
                        System.out.println("Compilation Errors");
                        return;
                    }
                }
                flag++;
                end=0;

            }

      if(s.charAt(i)=='(')
      {
            for(int j=i+1;j<s.length()-1;j++)
                {
                    if(s.charAt(j)==')'){
                    end=j;
                    break;
                    }
                }
                if(end==0)
                {System.out.println("Compilation Errors");return;}
                for(int j=i+1;j<end;j++)
                {
                    if(s.charAt(j)=='(')
                    {
                        System.out.println("Compilation Errors");
                        return;
                    }
                }
                
                end=0;


      }
      if(s.charAt(i)!='>'&&s.charAt(i)!='}'&&s.charAt(i)!=')'&&s.charAt(i)!=' ')
      count++;

       }
       if(count>100||flag==0)
       System.out.println("Compilation Errors");
       else
       System.out.println("No Compilation Errors");

    }
}