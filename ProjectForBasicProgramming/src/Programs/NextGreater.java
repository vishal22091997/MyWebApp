package Programs;

import java.util.Scanner;

public class NextGreater {
	Scanner scan = new Scanner(System.in);
	int t = scan.nextInt();
	while(t-->0){
		int n;
		n = scan.nextInt();
		int a[] = new int[6];
		int x = 0;
		while(n>0){
			a[x++] = n%10;
			n/=10;
		}
		boolean done = false;
		for(int i=0;i<x;i++){
			for(int j=i+1;j<x;j++){
				if(a[j]<a[i]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					done = true;
					break;
					}
			}
			if(done){
				break;
			}
		}
		if(done){
			for(int i=x-1;i>=0;i--){
				System.out.print(a[i]);
			}
			System.out.println();
		}else{
			System.out.println("not possible");
		}
	}

}
