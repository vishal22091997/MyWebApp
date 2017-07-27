package Programs;

import java.util.Scanner;

public class ReverseInString {
	public static void main(String djd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			String s = scan.nextLine();
			int i=0;
			int len = s.length();
			while(i<len){
				int end = s.indexOf('.');
				String sub = s.substring(i,end);
				for(int j=sub.length();j>=0;j--){
					System.out.print(sub.charAt(j));
				}
				i+=sub.length()+1;
			}
		}
	}

}
