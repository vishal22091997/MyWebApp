package Programs;

import java.util.Scanner;

public class GameOfXor {
	public static void main(String d[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int ans = 0,sum = 0;
			for(int i=0;i<n;i++){
				int x = scan.nextInt();
				sum =(i+1)*(n-i);
				ans = ans^((sum%2)*x);
				 
			}
			System.out.println(ans);
		}
	}

}
