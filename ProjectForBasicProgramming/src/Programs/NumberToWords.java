package Programs;

import java.util.Scanner;

public class NumberToWords {
	public static void main(String jdp[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		String ones[] = {
				"zero","one","two","three","four", "five","six","seven","eight","nine"				
		};
		String tens[] = {
				"ten","twenty","thirty","forty","fifty","sixty","seventy",
				"eighty","ninety"
		};
		
		while(t-->0){
			int n = scan.nextInt();
			String ans = "";
			for(int i=0;n>0;i++){
				int digit = n%10;
				if(i==0){
					ans = ones[digit]+ans;
				}
				else if(i==1&&digit!=0){
					ans = tens[digit]+ans;
				}else if(i==2&&digit!=0){
					ans = ones[digit]+" hundred and "+ans;
				}else if(i==3&&digit!=0){
					ans = ones[digit]+" thousand "+ans ;
				}
				
				
				n = n/10;
			}
			System.out.println(ans);
		}
	}

}
