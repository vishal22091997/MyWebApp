import java.util.Scanner;

public class CuttingString {
	public static void main(String hsj[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
			}
			int count = 0, ans = 0;
			for(int i=0;i<n;i++){
				if(i%2==0){
					if(a[i]%2!=0){
						ans++;
						if(a[i]>1){
							count--;
						}else{
							count++;
						}
					}
				}else{
					if(a[i]%2==0){
						ans++;
						if(a[i]>1){
							count--;
						}else{
							count++;
						}
					}
				}
				
			}
			if(count%2==0&&ans%2==0&&count<=0){
				System.out.println(ans/2);
			}else{
				System.out.println(-1);
			}
		}
	}

}