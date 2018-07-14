import java.util.*;
public class para
{
   public static int c=0;
    static void _Parenthesis(char str[], int pos, int n, int i, int j)
    {  
        if(j== n) 
        {
            
            for(int k=0;k<str.length;k++)
                System.out.print(str[k]+"");
                c++;
                    System.out.print(",");
            return;
        }
        else
        {  
            if(i > j) {
                str[pos] = ')';
                _Parenthesis(str, pos+1, n, i, j+1);
            }
            if(i < n) {
                str[pos] = '(';
                _Parenthesis(str, pos+1, n, i+1, j);
            }
        }
        
    }
     

    static void Parenthesis(char str[], int n)
    {   
        if(n > 0)
         System.out.print("[");
        _Parenthesis(str, 0, n, 0, 0);
        System.out.print("]");
        return;
    }
     
    public static void main (String[] args) 
    {
        int n = 2;
        
        char[] str = new char[2 * n];
        Parenthesis(str, n);
        System.out.print(c);
    }
}
 
