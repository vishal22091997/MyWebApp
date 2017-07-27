package Programs;
import java.util.*;
public class DoublingTheValue {
	public static void main(String jsp[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			long  n = scan.nextInt();
			long  k = scan.nextInt();
			while(n-->0){
				long x = scan.nextInt();
				if(x==k){
					k = k*2;
				}
			}
			System.out.println(k);
		}
	}

}
