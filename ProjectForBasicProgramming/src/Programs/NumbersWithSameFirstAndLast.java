package Programs;

import java.util.Scanner;

public class NumbersWithSameFirstAndLast {
	public static int[] firstAndLast(int n){
		int a[]= new int[2];
		a[0] = n%10;
		n/=10;
		int last = a[0];
		while(n!=0){
			last = n%10;
			n/=10;
		}
		a[1] = last;
		return a;
	}

	public static void main(String fj[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int s = scan.nextInt();
			int e = scan.nextInt();
			int count = 0;
			for(int i=s;i<=e;i++){
				int a[] = firstAndLast(i);
				if(a[0]==a[1]){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
