import java.util.Scanner;

public class ProductOfTwoDigitNumbers {
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			String s = scan.next();
			long prod = 1;
			for(int i=0,j=s.length();i<j-1;i+=2){
				long num = Long.parseLong(s.substring(i, i+2));
				prod = num*prod;
			}
			System.out.println(prod);
			
		}
	}

}
