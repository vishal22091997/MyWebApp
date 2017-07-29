package Programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InFirstButSecond {
	public static void main(String jdd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n1 = scan.nextInt(), n2 = scan.nextInt();
			int a[] = new int[n1];
			
			for(int i=0;i<n1;i++){
				a[i] = scan.nextInt();
			}
			Set<Integer> set = new HashSet<Integer>();
			for(int i=0;i<n2;i++){
				set.add(scan.nextInt());
			}
			for(int i=0;i<n1;i++){
				if(!set.contains(a[i])){
					System.out.print(a[i]+" ");
				}
			}
			System.out.println();
		}
	}

}
