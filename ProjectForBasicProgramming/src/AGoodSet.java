import java.util.*;
 
class AGoodSet {
	
	public static boolean isPrime(int n){
		if(n==1){
			return false;
		}else if(n==2){
			return true;
		}else{
			for(int i=2, j= (int)Math.sqrt(n);i<=j;i++){
				if(n%i==0){
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String hd[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		List<Map<Integer, Integer> > list = new ArrayList<Map<Integer, Integer> >();
		for(int i=0;i<n;i++){
			Map<Integer,Integer> map = new HashMap<Integer, Integer>();
			list.add(i, map);
		}
		int q = scan.nextInt();
		while(q-->0){
			int result = 0;
			int l = scan.nextInt()-1, r = scan.nextInt()-1, x = scan.nextInt(), y = scan.nextInt();
			if(x==1)
				x = 2;
			for(int i=x;i<=y;i+=2){
				if(i==2||(i%2!=0&&isPrime(i))){
					for(int j=l;j<=r;j++){
						Map<Integer, Integer> map = list.get(j);
						if(map.containsKey(i)){
							result+=map.get(i);
						}else{
							 
							int exp = 0;
							while(a[j]%i==0){
								exp++;
								a[j] = a[j]/i;
							}
							map.put(i, exp); 
							result+=exp;
						}
					}
				} 
				if(i==2){
					i--;
				}
			}
			
			
			
			 
			System.out.println(result);
		}
		
	}
 
}