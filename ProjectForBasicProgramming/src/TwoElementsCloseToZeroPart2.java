import java.util.Arrays;
import java.util.Scanner;

public class TwoElementsCloseToZeroPart2 {
	public static void main(String h[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = scan.nextInt();
			Arrays.sort(a);
			int i=0,j=n-1;
			int one = a[0], two = a[n-1];
			int curSum = one+two;
			while(i<j){
				int sum = a[i]+a[j];
				if(Math.abs(sum)<Math.abs(curSum)){
					one = a[i];
					two = a[j];
					curSum = one+two;
				}
				if(sum>0){
					j--;
				}else if(sum<0){
					i++;
				}
				
			}
			System.out.println(one+" "+two);
		}
	}

}
