import java.util.*;
public class hamming {
	
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
		
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		int k=hammingDistance(x,y);
		System.out.println(k);
	}
}
