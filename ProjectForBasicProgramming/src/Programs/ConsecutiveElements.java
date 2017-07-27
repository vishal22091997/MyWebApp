package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveElements {
	public static void main(String jsp[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int a[] = new int [n];
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();	
			}
			Arrays.sort(a);
			int start = a[0], end = a[a.length-1];
			boolean chudi = false;
			for(int i=0;i<n;i++){
				if(a[i]!=start){
					chudi = true;
					break;
				}
				start++;
			}
			if(!chudi){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}

}
