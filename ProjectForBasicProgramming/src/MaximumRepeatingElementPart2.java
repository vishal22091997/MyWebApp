import java.util.Scanner;

public class MaximumRepeatingElementPart2 {
	public static void main(String dj[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt(), k = scan.nextInt();
			int []a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
			}
			for(int i=0;i<n;i++){
				a[a[i]%k]+=k;
			}
			int maxIndex = -1;
			int maxValue = 0;
			for(int i=0;i<n;i++){
				if(a[i]>maxValue){
					maxValue = a[i];
					maxIndex = i;
				}
			}
			
			System.out.println(maxIndex);
		}
	}

}
