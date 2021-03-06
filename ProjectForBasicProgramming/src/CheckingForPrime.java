import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

  class CheckingForPrime {
	public static Map<Integer,Integer> primeFactors(int n)
	{
	    // Print the number of 2s that divide n
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		while (n%2 == 0)
	    {
			count++;
	        n = n/2;
	    }
		if(count>0)
			map.put(2, count);
	 
	    // n must be odd at this point.  So we can skip 
	    // one element (Note i = i +2)
	    for (int i = 3; i <= Math.sqrt(n); i = i+2)
	    {	 count = 0;
	        // While i divides n, print i and divide n
	        while (n%i == 0)
	        {
	            count++;
	            n = n/i;
	        }
	        if(count>0){
	        	map.put(i, count);
	        }
	    }
	 
	    // This condition is to handle the case when n 
	    // is a prime number greater than 2
	    if (n > 2){
	    	if(map.containsKey(n)){
	    		map.put(n, map.get(n)+1);
	        }else{
	        	map.put(n, 1);
	        }
	    }
	    return map;   
	}
	
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
	public static void main(String hf[]){
		Scanner scan = new Scanner(System.in);
		 
		 
			int n = scan.nextInt();
			List<Map<Integer, Integer>> list = new ArrayList<Map<Integer, Integer>>();
			for(int i=0;i<n;i++){
				int x = scan.nextInt();
				list.add(i, primeFactors(x));;
				
			}
			int q = scan.nextInt();
			while(q-->0){
				int result = 0;
				int l = scan.nextInt()-1, r = scan.nextInt()-1, x = scan.nextInt(), y = scan.nextInt();
				if(x==1){
					x = 2;
				}
				for(int i=x;i<=y;i+=2){
					if(i==2||(i%2!=0&&isPrime(i))){
						for(int j=l;j<=r;j++){
							Map<Integer, Integer> map = list.get(j);
							if(map.containsKey(i))
								result+=map.get(i);
						}
					}
					if(i==2){
						i = 1;
					}
				}
				System.out.println(result);
			}
			
		 
		
	}

}
