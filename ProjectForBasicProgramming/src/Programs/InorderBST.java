package Programs;

import java.util.Scanner;

public class InorderBST {
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int cur = 0;
			boolean ans = true;
			while(n-->0){
				int x = scan.nextInt();
				if(ans){
					if(x<=cur){
						ans = false;
					}
					cur = x;
				}
			}
			if(ans){
				System.out.println(1);
			}
			else{
				System.out.println(0);
			}
		}
	}

}
