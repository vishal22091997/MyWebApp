import java.util.Scanner;

public class Maximumrepeatingnumber {
	public static void main(String dj[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt(), k = scan.nextInt();
			int [] a = new int[k];
			for(int i=0;i<n;i++){
				int x = scan.nextInt();
				a[x]++;
			}
			int max = -1;
			int index = -1;
			for(int i=0;i<k;i++){
				if(a[i]>max){
					max = a[i];
					index = i;
				}
			}
			System.out.println(index);
		}
	}

}
