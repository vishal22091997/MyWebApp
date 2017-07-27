import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MaxSumGCD {
	static int gcd(int a, int b)
	{
	    // Everything divides 0 
	    if (a == 0 || b == 0)
	       return 0;
	 
	    // base case
	    if (a == b)
	        return a;
	 
	    // a is greater
	    if (a > b)
	        return gcd(a-b, b);
	    return gcd(a, b-a);
	}
	public static void main(String gjf[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		Set<Integer> set = new HashSet<Integer>();
		int max1=0, max2 =0 ;
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
			if(a[i]>max1){
				max1 = a[i];
			}
		}
			
		for(int j=0;j<n;j++){
			b[j] = scan.nextInt();
			if(b[j]>max2){
				max2 = b[j];
			}
		}
		int start = Math.min(max1, max2);
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=start;i>=1;i--){
			boolean mul1 = false, mul2 = false;
			int val1 = 0, val2 = 0;
			for(int j=n-1;j>=0;j--){
				if(a[j]%i==0){
					mul1 = true;
					val1 = a[j];
					break;
				}
			}
			for(int j=0;j<n;j++){
				if(b[j]%i==0){
					mul2 = true;
					val2 = b[j];
					break;
				}
			}
			if(mul1&&mul2){
				System.out.println(val1+val2);
				break;
			}
		}
		 	
		
		
	}

}
