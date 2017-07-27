package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class CamelCase {
	public static String makeIt(String s){
		String ans = "";
		for(int i=0,j=s.length();i<j;i++){
			if(Character.isUpperCase(s.charAt(i))){
				ans+=s.charAt(i);
			}
		}
		return ans;
	}
	public static void main(String hg[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			String s[] = new String[n];
			String b[] = new String[n];
			String c[] = new String[n];
			for(int i=0;i<n;i++){
				b[i] = scan.next();
				s[i] = makeIt(b[i]);
			}
			Arrays.sort(b);
			Arrays.sort(s);
			String check = scan.next();
			 
			int x = 0;
			for(int i=0;i<n;i++){
				if(s[i].indexOf(check)!=-1){
					System.out.println(s[i]+" "+b[i]+" ");
					x++;
				}
			}
			 
			if(x==0){
				System.out.println("No match found");
			}
			
		}
	}

}
