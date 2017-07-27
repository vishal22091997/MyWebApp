package Programs;

import java.util.Scanner;

public class StringComparison {
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			String s1 = scan.next();
			String s2 = scan.next();
			int l1 = s1.length(), l2 = s2.length();
			int len = Math.min(l1, l2);
			int in1 = s1.indexOf("ng"), in2 = s2.indexOf("ng");
			if(in1!=-1&&in2!=-1){
				for(int i=0;i<len;i++){
					char c1 = s1.charAt(i), c2 = s2.charAt(i);
					if(c1!='n')
				}
			}
		}
	}

}
