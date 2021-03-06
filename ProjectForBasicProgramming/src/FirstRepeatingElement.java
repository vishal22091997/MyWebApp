import java.util.*;
import java.util.Set;

public class FirstRepeatingElement {
	public static void main(String s[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			int index = 1000000;
			for(int i=0;i<n;i++){
				int x = scan.nextInt();
				if(map.containsKey(x)){
					int cur = map.get(x);
					if(cur<index){
						index = cur;
					}
				}else{
					map.put(x, i+1);
				}
			}
			if(index!=1000000){
				System.out.println(index);
			}else{
				System.out.println(-1);
			}
		}
	}

}
