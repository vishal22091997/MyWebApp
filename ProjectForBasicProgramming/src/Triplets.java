import java.util.Scanner;

public class Triplets {
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
			for(int j=0;j<q;j++){
				b[j] = scan.nextInt();
			}
			for(int k=0;k<r;k++){
				c[k] = scan.nextInt();
			}
			
			long ans = 0;
			for(int i=0;i<p;i++){
				long x = a[i];
				for(int j=0;j<q;j++){
					long y = b[j];
					if(x<=y){
						long xsum = x+y;
						long count = 0;
						long curSum = 0;
						for(int k=0;k<r;k++){
							long z = c[k];
							if(y>=z){
								ans += xsum*(y+z);
								
								ans = ans%1000000007;
							}
						}
					}
				}
			}
			System.out.println(ans);
		}
	}

}
