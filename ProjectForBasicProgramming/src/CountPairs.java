import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountPairs {
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int  t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt(), k = scan.nextInt();
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			int count = 0;
			for(int i=0;i<n;i++){
				int x = scan.nextInt();
				int req = k-x;
				if(map.containsKey(req)){
					count+=map.get(req);
				}
				if(map.containsKey(x)){
					map.put(x, map.get(x)+1);
				}else{
					map.put(x, 1);
				}
			}
			System.out.println(count);
		}
	}

}
