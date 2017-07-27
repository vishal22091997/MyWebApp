package Programs;

import java.util.*;

public class SameOccurances {
	public static void main(String fj[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		Map<String, Map<Integer, Integer>> map = new HashMap<String, Map<Integer, Integer>>();
		for(int i=0;i<n;i++){
			Map<Integer, Integer> last = new HashMap<Integer, Integer>();
			for(int j=i;j<n;j++){
				
				String key = i+""+j;
				if(last.size()==0){
					last.put(a[i], 1);
					map.put(key, new HashMap<Integer, Integer>(last));
				}else{
					if(last.containsKey(a[j])){
						last.put(a[j], last.get(a[j])+1);
					}else{
						last.put(a[j],  1);
					}
					
					map.put(key, new HashMap<Integer, Integer>(last));
				}
				
			}
		}
		while(q-->0){
			int x = scan.nextInt();
			int y = scan.nextInt();
			int count = 0;
			for(int i=0;i<n;i++){
				for(int j=i;j<n;j++){
					String key = i+""+j;
					Map<Integer,  Integer>map2 = map.get(key);
					if(map2.get(x)==map2.get(y)){
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

}