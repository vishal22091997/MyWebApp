package Programs;

import java.util.Scanner;

public class OverlappingIntervals {
	public static void main(String sjs[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int min = 1000, max = 0;
			int a[] = new int[101];
			for(int i=0;i<n;i++){
				int s = scan.nextInt(), e = scan.nextInt();
				if(s<min){
					min = s;
				}
				if(e>max){
					max = e;
				}
				if(s==e&&a[s]==0){
					a[s] = -1;
				}
				for(int tu=s;tu<e;tu++){
					a[tu] = 1;
				}
			}
			boolean ones;
			if(a[min]==-1){
				System.out.print(min+" "+min+" ");
				ones = false;
			}else{
				System.out.print(min+" ");
				ones = true;
			}
			
			 
			for(int i=min+1;i<max;i++){
				if(a[i]==-1){
					System.out.print(i+" "+i+" ");
					ones = false;
				}else{
					if(ones&&a[i]==0){
						System.out.print(i+" ");
						ones = false;
					}
					if(!ones&&a[i]==1){
						System.out.print(i+" ");
						ones = true;
					}
				}
				
			}
			if(ones){
				System.out.print(max);
				System.out.println();
			
			}
		}
	}

}
