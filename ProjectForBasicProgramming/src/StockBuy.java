import java.util.Scanner;

public class StockBuy {
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
			}
			int last = a[0];
			int pur = -1, sell = -1;
			int count = 0;
			for(int i=1;i<n;i++){
				if(pur==-1){
					if(a[i]>last){
						pur = i-1;
					}
					last = a[i];
				}else{
					if(a[i]<last){
						sell = i-1;
					}
					last = a[i];
				}
				if(sell!=-1){
					System.out.print("("+pur+" "+sell+") ");
					pur = -1;
					sell = -1;
					last = a[i];
					count++;
				}
			}
			if(pur!=-1){
				count++;
				System.out.print("("+pur+" "+(n-1)+") ");
			}
			 
			if(count==0){
				System.out.print("No Profit");
			}
			System.out.println();
		}
	}

}
