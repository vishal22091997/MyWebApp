package Programs;

import java.util.Scanner;

public class FindMissingAndRepeating {
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				int x = scan.nextInt();
				a[x-1]++;
			}
			int doub=-1,miss=-1;
			for(int i=0;i<n;i++){
				if(a[i]==0&&miss==-1){
					miss = i+1;
				}
				if(a[i]==2&&doub==-1){
					doub = i+1;
				}
			}
			System.out.println(doub+" "+miss);
		}
	}

}
