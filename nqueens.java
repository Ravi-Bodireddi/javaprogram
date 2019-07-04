public class nqueens
{

public static boolean safe(char arr[][],int row,int col)
{
    for(int i=0;i<arr.length;i++)
    {
        if(arr[row][i]=='#')
            return false;
    }
    for(int i=0;i<arr.length;i++)
{
if(arr[i][col]=='#')  // checkind downward;
return false;
}
for(int k=row,l=col;k>=0&&l>=0;k--,l--)
if(arr[k][l]=='#')  // checking southeast;
return false;
for(int k=row+1,l=col-1;k<arr.length&&l>=0;k++,l--)
if(arr[k][l]=='#')  // checking southwest;
return false;;
    return true;
}
public static boolean placequeen(char arr[][],int col)
{
    if(col>=arr.length)
        return true;
    for(int i=0;i<arr.length;i++)
    {
        if(safe(arr,i,col)==true)
        {
            arr[i][col]='#';
            if(placequeen(arr,col+1)==true)
                return true;
            arr[i][col]='*';
        }
    }
    return false;
}

public static char[][] Met(char arr[][])
{
    placequeen(arr,0);
    return arr;
}




    public static void main(String args[])
    {
        char arr[][]=new char[4][4];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]='*';
            }
        }
        Met(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}