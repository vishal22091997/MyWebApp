package Programs;

import java.util.*;

public class CoutingAnagrams {
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			String s = scan.next();
			String ana = scan.next();
			int a[] = new int[26];
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			for(int i=0,j=ana.length();i<j;i++){
				a[ana.charAt(i)-'a']++;
			}
			 
			boolean check = false;
			int b[] = new int[26];
			for(int i=0,j=s.length();i<j;i++){
				if(check||a[s.charAt(i)-'a']>0){
					check = true;
					
				}else if(check){
					
				}
				else{
					check = false;
				}
			}
			
		}
	}

}
