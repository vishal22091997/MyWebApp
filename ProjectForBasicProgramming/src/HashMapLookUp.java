import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class HashMapLookUp {
	public static void main(String dj[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			 
			Set<Integer> set = new HashSet<Integer>();
			int n = scan.nextInt(), m = scan.nextInt(), k = scan.nextInt(); 
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
			}
			Arrays.sort(a);
			for(int i=0;i<m;i++){
				set.add(scan.nextInt());
			}
			String ans = "";
			for(int i=0;i<n;i++){
				int rem = k-a[i];
				if(set.contains(rem)){
					ans += (a[i]+" "+rem+", ");
				}
			}
			if(ans.length()>0){
				System.out.println(ans.substring(0, ans.length()-2));
			}else{
				System.out.println(-1);
			}
		}
	}

}
