package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
			}
			Arrays.sort(a);
			for(int i=1;i<n;i+=2){
				int temp = a[i];
				a[i] = a[i-1];
				a[i-1] = temp;
			}
			for(int i=0;i<n;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}

}
