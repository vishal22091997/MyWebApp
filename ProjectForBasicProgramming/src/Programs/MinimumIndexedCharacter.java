package Programs;

import java.util.Scanner;

public class MinimumIndexedCharacter {
	public static void main(String js[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			String main = scan.next();
			String pat = scan.next();
			boolean a[] = new boolean[26];
			for(int i=0,j=pat.length();i<j;i++){
				a[pat.charAt(i)-'a'] = true;
			}
			boolean print = false;
			for(int i=0,j=main.length();i<j;i++){
				if(a[main.charAt(i)-'a']){
					System.out.print(main.charAt(i));
					print = true;
					break;
				}
			}
			if(!print){
				System.out.println("No character present");
			}
		}
	}

}
