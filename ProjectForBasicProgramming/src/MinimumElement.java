import java.util.Scanner;

public class MinimumElement {
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
			}
			int i=0,j=n-1;
			int mid = (i+j)/2;
			
			while(i<j){
				if(i<=mid-1){
					
				}
				if(j>=mid+1){
					
				}
				if(a[mid]<a[mid-1]&&a[mid]<a[mid+1]){
					System.out.println(a[mid]);
				}else if(a[mid]<a[mid-1]){
					i = mid+1;
				}else if(a[mid]<a[mid+1]){
					j = mid-1;
				}
				mid = (i+j)/2;
			}
			if(n==1){
				System.out.println(a[0]);
			}
		}
	}

}
