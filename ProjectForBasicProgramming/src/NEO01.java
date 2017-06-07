import java.util.Arrays;
import java.util.Scanner;

public class NEO01 {
	public static void main(String hdk[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int a[] = new int[n];
			 
			
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
				 
			}
			Arrays.sort(a);
			 
			 
			
			long curSum = a[n-1];
			long curAns = a[n-1];
			 
			int i;
			for(i=n-2;i>=0;i--){ 
				int ind = n-i;
				long tempCheck = (long)(ind*((long)a[i]+curSum));
				if(tempCheck>=curAns){
					curAns = tempCheck;
					curSum = curSum+a[i];
				}
				else{
					break;
				}
				
			}
			if(i!=-1){
				 
				for(;i>=0;i--){
					curAns+=a[i];
				}
			}
			System.out.println(curAns);
		}
	}

}
