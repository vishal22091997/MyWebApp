	import java.util.Arrays;
	import java.util.Scanner;
	
	public class TwoNumbersWithSumCloseToZero {
		public static void main(String h[]){
			Scanner scan = new Scanner(System.in);
			int t = scan.nextInt();
			while(t-->0){
				int n = scan.nextInt();
				int a[] = new int[n];
				for(int i=0;i<n;i++)
					a[i] = scan.nextInt();
				 
				int one = a[0];
				int two = a[1];
				int sum = one+two;
				for(int i=0;i<n;i++){
					for(int j=i+1;j<n;j++){
						if(Math.abs(a[i]+a[j])<Math.abs(one+two)){
							one = a[i];
							two = a[j];
						}
					}
				}
				System.out.println(one+" "+two);
			}
		}
	
	}
