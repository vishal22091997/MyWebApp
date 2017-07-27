package Programs;

import java.util.Scanner;

public class GCD {
	public int gcd(int a, int b)
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
	public static void main(String dujd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			
		}
	}

}
