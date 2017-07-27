import java.util.Scanner;

public class MergingSortedArrays {
	public static void main(String fg[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt(), m = scan.nextInt();
			int[] a = new int[n];
			int[] b = new int[m];
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
			}
			for(int i=0;i<m;i++){
				b[i] = scan.nextInt();
			}
			int c[] = new int[n+m];
			int i=0,j=0,k=0;
			while(i<n&&j<m){
				if(a[i]>b[j]){
					c[k++] = a[i++];
				}else if(a[i]<b[j]){
					c[k++] = b[j++];
				}else{
					c[k++] = a[i++];
					c[k++] = b[j++];
				}
			}
			while(i<n){
				c[k++] = a[i++];
			}
			while(j<m){
				c[k++] = b[j++];
			}
			for(int l=0;l<n+m;l++){
				System.out.print(c[l]+" ");
			}
		}
	}

}
