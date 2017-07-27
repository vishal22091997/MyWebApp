package Programs;

import java.util.Scanner;

public class ArrayToBST {
	private static void printCenter(int s, int e, int[] a,int f){
		
		if(e<s){
			return;
		}
		int mid = (s+e)/2;
		System.out.print(a[mid]+" ");
		int left = mid-1, right = mid+1;
		 
			printCenter(s,left,a,f);
		 
		 
			printCenter(right, e, a , f);
		 
	}
	public static void main(String djd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
			}
			printCenter(0,n-1,a, n);
		}
	}

}
