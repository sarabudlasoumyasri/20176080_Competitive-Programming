import java.util.*;
public class gap{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int k=solution(N);
        System.out.println(k);
    }
public static int solution(int N) {
        String str = Integer.toBinaryString(N);
        str = str.replace("0", " ").trim();
        String[] zeroGroups = str.split("1");
                
        if (zeroGroups.length == 0) return 0;
        
        int[] gaps = new int[zeroGroups.length];
        for (int i = 0; i < zeroGroups.length; i++){
            gaps[i] = zeroGroups[i].length();
        }
        Arrays.sort(gaps);        
        return gaps[gaps.length-1];
    }
}
