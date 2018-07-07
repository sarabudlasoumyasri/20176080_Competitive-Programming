import java.util.*;
public class ana
{
    static void Anagram(String s, String t)
    {
       	String m = s.replaceAll("\\s", "").toLowerCase();
 
        String n = t.replaceAll("\\s", "").toLowerCase();
      
 
        boolean x= true;
 
        if(m.length()== n.length())
        {
          StringBuilder obj = new StringBuilder(n);  
          char[] i = m.toCharArray();
 
 
            
 
            
 
            for (char c : i)
            {
                int j = obj.indexOf(""+c);
 
                if (j == -1)
                {
                    
 					x = false;
 
                    break;
                    
                }
                else
                {
 
                    obj = obj.deleteCharAt(j);
                }
            }
        }
        else
        {
          
 			x=false;
            
        }
 
      
 
        if(x)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
 
    public static void main(String[] args)
    {	 
    
    	Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String t=scan.nextLine();
		Anagram(s,t);
			
}
}