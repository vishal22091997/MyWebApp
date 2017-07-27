import java.util.Scanner;

public class FloorInSortingPart2 {
	public static void main(String ss[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int k = scan.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
			}
			
			if(k>=a[n-1]){
				System.out.println(n-1);
			}
			else if(k<a[0]){
				System.out.println(-1);
			}else{
				int low = 0, high = n-1;
				int mid = (low+high)/2;
				while(low<high){
					mid = (low+high)/2;
					if(a[mid-1]<=k&&a[mid]>k){
						System.out.println(mid-1);
						break;
					}
					if(a[mid]>k){
						high = mid;
					}else if(a[mid]<k){
						low = mid;
					}else if(a[mid]==k){
						System.out.println(mid);
						break;
					}
					
				}
			}
		}
	}

}
