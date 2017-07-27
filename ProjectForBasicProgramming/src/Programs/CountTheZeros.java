package Programs;

import java.util.*;
public class CountTheZeros {
	public static void main(String jf[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int a[ ] = new int[n];
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
			}
			int beg = 0, end = n-1, mid;
			while(beg<end){
				mid = (beg+end)/2;
				if(mid==0&&a[mid+1]==0){
					end = mid-1;
				}else if(mid==1&&a[mid+1]==1){
					beg = mid+1;
				}else if(mid==1&&a[mid+1]==0){
					System.out.println(n-mid-1);
					break;
				}else if(mid==0&&a[mid-1]==1){
					System.out.println(n-mid);
					break;
				}
			}
			if(end==0){
				System.out.println(n);
			}else if(beg==n-1){
				System.out.println(0);
			}
			
		}
	}

}
