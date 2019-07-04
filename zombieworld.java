import java.util.*;
public class zombieworld{
    public static int getmin(char arr[][],int i,int j,int count,int min)
    {
        if(i<0||i>arr[0].length||j<0||j>arr.length)
        return 0;
       if(arr[i][j]!='G')
       {
           return 0;
       }
       if(arr[i][j]=='s')
       return 1;
       for(int start=j;start<arr.length;start++)
       {
         if(arr[i][start]=='G')
         {
             count=count+getmin(arr,i,start+1,count,min);
             
         }
       }
       for(int start=j;start>=0;start--)
       {
           if(arr[i][start]=='G')
           count=count+getmin(arr,i,start-1,count,min);
       }
    for(int start=i;start<arr[0].length;start++)
    {
        if(arr[start][j]=='G')
        count=count+getmin(arr,start+1,j,count,min);
    }
    for(int start=i;start>=0;start--)
    {
        if(arr[start][j]=='G')
        count=count+getmin(arr,start-1,j,count,min);
    }
    if(count==0)
    return 0;
    if(count<min)
    {
    min=count;
    }
   return min;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[4][2];
        int count=0;
        int total=0;
        char layout[][]=new char[row][col];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<2;j++){
            arr[i][j]=sc.nextInt();
           
            }

            
        }
       /* for(int i=0;i<4;i++)
        {
            for(int j=0;j<2;j++){
           System.out.print( arr[i][j]);
           
            }

            System.out.println();
        }

        
        4 6
1 6 3 6 4 6 3 4
W M G G G G
M G W G M M
G W G G G G
W G W M W G
 */

      
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
             {
                 layout[i][j]=sc.next().charAt(0);
                  if(layout[i][j]=='G')
            count++;
             }
        }
          total=count;
       layout[arr[0][0]-1][arr[0][1]-1]='s';
       layout[arr[1][0]-1][arr[1][1]-1]='s';
       layout[arr[2][0]-1][arr[2][1]-1]='s';
       layout[arr[3][0]-1][arr[3][1]-1]='z';
       int r=arr[3][0]-1;
       int c=arr[3][1]-1;
     System.out.println();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
             {
                 System.out.print(layout[i][j]+" ");
            //count++;
             }
             System.out.println();
        }
    /*   if(r==0)
       {
           if(layout[r+1][c]=='G')
           count--;
           if(c!=0&&layout[r][c-1]=='G')
           count--;
           if(c!=col-1 &&layout[r][c+1]=='G')
           count--;
       }

      else if(r==row-1)
      {
           if(layout[r-1][c]=='G')
           count--;   
           if(c!=0&&layout[r][c-1]=='G')
           count--;
           if(c!=col-1 &&layout[r][c+1]=='G')
           count--;

      }
      else{
           if(layout[r+1][c]=='G')
           count--;
           if(layout[r-1][c]=='G')
           count--;   
           if(c!=0&&layout[r][c-1]=='G')
           count--;
           if(c!=col-1 &&layout[r][c+1]=='G')
           count--;

      }
   //   count--;
   */

  ArrayList<Integer> min_dist_gate=new ArrayList<Integer>();
   for(int i=0;i<row;i++)
   {
       for(int j=0;j<col;j++)
       {
        if(layout[i][j]=='G')
        {
            int min=0;
          int max=Integer.MAX_VALUE;
            min_dist_gate.add(getmin(layout,i,j,count,min));
        }   
       }
   }
     /* float final_res=count*100/total;
      System.out.println(total);
      System.out.println(count);
      System.out.println(final_res);*/
      System.out.println(min_dist_gate);

    }
}
