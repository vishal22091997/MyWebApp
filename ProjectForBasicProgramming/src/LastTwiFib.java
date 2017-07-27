import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LastTwiFib {
	static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	public static int calFib(int n){
		 if(n<=1){
			 return n;
		 }else{
			 int fib1,fib2;
			 fib1 = calFib(n-1);
			 fib2 = calFib(n-2);
			 int ans = fib1+fib2;
			 if(ans>=100){
				 return ans%100;
			 }else{
				 return ans;
			 }
		 }
		
	}
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int ans = calFib(n);
			System.out.println(ans);
			 
		}
	}

}
