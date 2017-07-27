package Programs;

import java.util.*;

public class CountAnagrams {
	public static double distance(int x1,int y1, int x2, int y2){
		return  Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
	}
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int a[] = new int[8];
			for(int i=0;i<8;i++){
				a[i] = scan.nextInt();
			}
			Map<Double, Integer> map = new HashMap<Double, Integer>();
			Set<Double> set = new HashSet<Double>();
			for(int i=0;i<8;i+=2){
				for(int j=i+2;j<8;j+=2){
					double dis = distance(a[i],a[i+1],a[j],a[j+1]);
					if(map.containsKey(dis)){
						map.put(dis,map.get(dis)+1);
					}else{
						map.put(dis, 1);
						set.add(dis);
					}
				}
			}
			 
			if(set.size()==2){
				Iterator<Double> it = set.iterator();
				double cur1 = map.get(it.next());
				double cur2 = map.get(it.next());
				if((cur1==4&&cur2==2)||(cur1==2&&cur2==4)){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			}else{
				System.out.println("No");
			}
		}
	}

}
