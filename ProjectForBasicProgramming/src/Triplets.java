import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 
 class Triplets {
	public static void main(String djd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int p = scan.nextInt(), q = scan.nextInt(), r = scan.nextInt();
			int a[] = new int[p];
			int b[] = new int[q];
			int c[] = new int[r];
			for(int i=0;i<p;i++){
				a[i] = scan.nextInt();
			}
			 Arrays.sort(a);
			for(int j=0;j<q;j++){
				b[j] = scan.nextInt();
			}
			 Arrays.sort(b);
			for(int k=0;k<r;k++){
				c[k] = scan.nextInt();
			}
			Arrays.sort(c);
			 
			long ans = 0;
			List<Integer> xySum = new ArrayList<Integer>();
			List<Integer> yzSum = new ArrayList<Integer>();
			for(int i=0;i<p;i++){
				for(int j=q-1;j>=0;j--){
					if(a[i]<=b[j]){
						xySum.add(a[i]+b[j]);
					}else{
						break;
					}
				}
			}
			 
			for(int j=0;j<q;j++){
				for(int k=0;k<r;k++){
					if(c[k]<=b[j]){
						yzSum.add(b[j]+c[k]);
					}else{
						break;
					}
				}
			}
			 
			int size1 = xySum.size();
			int size2 = yzSum.size();
			for(int i=0;i<size1;i++){
				for(int j=0;j<size2;j++){
					ans+=(long)xySum.get(i)*(long)yzSum.get(j);
					ans = ans%1000000007;
				}
			}
			
			
			
			
			 
			System.out.println(ans);
		}
	}
 
} 