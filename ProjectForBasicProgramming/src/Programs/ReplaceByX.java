package Programs;

import java.util.Scanner;

public class ReplaceByX {
	public static void main(String hdj[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			String s = scan.next();
			String a = scan.next();
			s = s.replaceAll(a, "X");
			while(s.indexOf("XX")!=-1){
				s = s.replaceAll("XX", "X");
			}
			System.out.println(s);
		}
	}

}
