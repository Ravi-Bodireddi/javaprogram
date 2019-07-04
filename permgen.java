import java.util.*;
public class permgen{
 private static void permute(String str, int l, int r,ArrayList<String>arr) 
    { 
        if (l == r) {
            arr.add(str);
        }
        else { 
            for (int i = l; i <= r; i++) { 
                str = swap(str, l, i); 
                permute(str, l + 1, r,arr); 
                str = swap(str, l, i); 
            } 
        } 
    } 
  
    /** 
     * Swap Characters at position 
     * @param a string value 
     * @param i position 1 
     * @param j position 2 
     * @return swapped string 
     */
    public static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i]; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 

    public static void main(String args[])
    {
        String str="BCA";
        ArrayList<String>arr=new ArrayList<String>();

        permute(str,0,str.length()-1,arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}