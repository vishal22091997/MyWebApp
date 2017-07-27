package Programs;

import java.util.Scanner;

public class SubArrayWithGivenSm {
	public static void main(String jdp[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			boolean print = false;
			int n = scan.nextInt(), k = scan.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
			}
			int s = 0,end=0;
			int sum = 0;
			for(int i=0;i<n;i++){
				if(sum<k){
					sum+=a[i];
					end = i;
				} if(sum>k){
					while(sum>k){
						sum-=a[s++];
					}
				}
				if(sum==k){
					System.out.println((s+1)+" "+(end+1));
					print = true;
					break;
				}
			}
			if(!print){
				System.out.println(-1);
			}
		}
	}
}
