
import java.util.*;
class morse{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] array = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",
				  ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		String org[]={"gin", "zen", "gig","msg"};
			for (int j=0;j<org.length ;j++) {
					System.out.println(org[j]+"--------------->"+uniquemorse(array,org[j]));	
			}

		System.out.println("total transformations = "+obj.size());

	}
	
	public static ArrayList<String> obj=new ArrayList<String>();

	public static String uniquemorse(String arr[],String k){
		String a="";
		for (int i=0;i<k.length();i++) {
			int m=k.charAt(i)-97;
			a+=arr[m];
		}
		if(!obj.contains(a))
			obj.add(a);
		return a;
	}
}


