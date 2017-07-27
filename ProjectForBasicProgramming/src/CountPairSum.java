import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountPairSum {
	public static void main(String dj[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt(), m = scan.nextInt();
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			int last = scan.nextInt();
			int c = 1;
			for(int i=1;i<n;i++){
				int cur = scan.nextInt();
				if(cur==last){
					c++;
				}else{
					map.put(last, c);
					c = 1;
					last = cur;
				}
			}
			if(c>0){
				map.put(last, c);
			}
			int []a = new int[m];
			for(int i=0;i<m;i++){
				a[i] = scan.nextInt();
			}
			 
			int k = scan.nextInt();
			int ans = 0;
			for(int i=0;i<m;i++){
				int left = k-a[i];
				if(map.containsKey(left)){
					ans+=map.get(left);
				}
			}
			System.out.println(ans);
		}
	}

}
