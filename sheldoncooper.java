
public class sheldoncooper{
    public static boolean helper(int a[],int target,int sum,int count,int i)
    {
          if(count==3) {
           System.out.println("sum:"+sum);
          // System.out.println("i"+i);
            if(sum==target)
            return true;
            return false;
        }

        if(i>=a.length)
        {
            return false;
        }
        
      
        if( helper (a,target,sum+a[i],count+1,i+1)==true )
        return true;
       else if( helper(a,target,sum,count,i+1)==true)
       return true;
       return false;
   
       
       

    }
 public static boolean check(int a[],int target)
 {
     int sum=0,count=0,i=0;
     return helper(a,target,sum,count,i);
 }

    public static void main(String args[])
    {
        int a[]={1,2,5,10,34,20};
        int target=40;
        System.out.println(check(a,target));

    }
}