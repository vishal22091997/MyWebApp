package Programs;

import java.util.*;

public class RemoveAll {
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = scan.nextInt();
			for(int j=0;j<n;j++)
				b[j] = scan.nextInt();
			int last = b[0];
			int count = 1;
			PriorityQueue<Integer> q = new PriorityQueue<Integer>();
			q.add(b[0]);
			
			for(int i=1;i<n;i++){
				if(q.peek()<a[i]){
					 q.poll();
				}else{
					count++;
					q.add(b[i]);
				}
			}
			System.out.println(count);
			
		}
	}

}
