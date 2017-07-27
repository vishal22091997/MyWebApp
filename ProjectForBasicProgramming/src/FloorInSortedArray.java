import java.util.Scanner;

public class FloorInSortedArray {
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
			for(int i=0;i<n;i++){
				if(a[i]>k){
					if(i==0){
						System.out.println(-1);
					}else{
						System.out.println(i-1);
					}
					break;
				}
			}
		}
	}

}
