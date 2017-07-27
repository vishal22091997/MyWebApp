package Programs;

import java.util.Scanner;

public class IsomorphicStrings {
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			String a = scan.next();
			String b = scan.next();
			int sam[] = new int[26];
			boolean print = false;
			for(int i=0,j=a.length();i<j;i++){
				char achar = a.charAt(i), bchar = b.charAt(i);
				if(sam[achar-'a']==0){
					sam[achar-'a'] = bchar;
					
				}else{
					if(sam[achar-'a']!=bchar ){
						System.out.println(0);
						print = true;
						break;
						
					}
				}
			}
			if(!print){
				System.out.println(1);
			}
		}
	}

}
