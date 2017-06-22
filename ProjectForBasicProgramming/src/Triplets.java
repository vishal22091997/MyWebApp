import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
 
 class Triplets {
	public static void main(String djd[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer ttoken = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(ttoken.nextToken());
		
		while(t-->0){
			StringTokenizer token = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(token.nextToken());
			int q = Integer.parseInt(token.nextToken());
			int r = Integer.parseInt(token.nextToken());
			 
			int a[] = new int[p];
			int b[] = new int[q];
			int c[] = new int[r];
			StringTokenizer aString = new StringTokenizer(br.readLine());
			for(int i=0;i<p;i++){
				a[i] = Integer.parseInt(aString.nextToken());
			}
			 Arrays.sort(a);
			  aString = new StringTokenizer(br.readLine());
			for(int j=0;j<q;j++){
				b[j] = Integer.parseInt(aString.nextToken());
			}
			 Arrays.sort(b);
			 aString = new StringTokenizer(br.readLine());
			for(int k=0;k<r;k++){
				c[k] = Integer.parseInt(aString.nextToken());
			}
			Arrays.sort(c);
			 
			long ans = 0;
			for(int i =q-1;i>=0;i--){
				if(b[i]>=a[0]){
					for(int j=0;j<p;j++){
						if(b[i]>=a[j]){
							for(int k=0;k<r;k++){
								if(c[k]<=b[i]){
									ans += (long)(b[i]+a[j])*(long)(b[i]+c[k]);
									ans = ans%1000000007 ;
									
								}else{
									break;
								}
							}
						}else{
							break;
						}
					}
				}else{
					break;
				}
			}
			
			
			
			 
			System.out.println(ans);
		}
	}
 
} 