package Programs;

import java.util.HashSet;
import java.util.Scanner;

public class PythagoreanTriplets {
	public static void main(String ash[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int a[] = new int[n];
			HashSet<Integer> set = new HashSet<Integer>();
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
				set.add(a[i]*a[i]);
			}
			boolean print = true;
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					int find = (int) (Math.pow(a[i],2)+Math.pow(a[j], 2));
					if(set.contains(find)){
						System.out.println("Yes");
						print = true;
						break;
					}
				}
			}
			if(!print){
				System.out.println("No");
			}
			
		}
	}

}
