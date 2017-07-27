import java.util.Arrays;
import java.util.Scanner;

public class LengthUnSortedSubArray {
	public static void main(String hd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
				b[i] = a[i];
			}
			Arrays.sort(b);
			int i = 0;
			while(a[i]==b[i]) i++;
			int j=n-1;
			while(a[j]==b[j]) j--;
			System.out.println(i+" "+j);
		}
	}

}
