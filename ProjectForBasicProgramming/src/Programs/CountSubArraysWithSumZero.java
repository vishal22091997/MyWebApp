package Programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountSubArraysWithSumZero {
	public static void main(String jspp[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int curSum = 0, ans = 0;
			Set<Integer> set = new HashSet<Integer>();
			for(int i=0;i<n;i++){
				int x = scan.nextInt();
				curSum+=x;
				if(curSum==0){
					ans++;
				}
				
				
					if(set.contains(curSum)){
						ans++;
					}else{
						set.add(curSum);
					}
				 
			}
			System.out.println(ans);
		}
	}

}
