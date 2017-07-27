package Programs;

import java.util.*;
 

public class KthDistance {
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int k = scan.nextInt();
			int n = scan.nextInt();
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			boolean tr = false;
			for(int i=0;i<n;i++){
				int x = scan.nextInt();
				if(!tr){
					if(map.containsKey(x)){
						int val = map.get(x);
						if(i-val<=k){
							tr = true;
						}
					}else{
						map.put(x, i);
					}
				}
				
			}
			if(tr){
				System.out.println("True");
			}else{
				System.out.println("False");
			}
		}
	}

}
