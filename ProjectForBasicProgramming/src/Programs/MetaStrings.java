package Programs;

import java.util.*;

public class MetaStrings {
	public static void main(String jf[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			String a = scan.next();
			String b = scan.next();
			int lena = a.length(), lenb = b.length();
			if(lena!=lenb){
				System.out.println(0);
			}else{
				int f = 0, s =0;
				boolean print = false;
				for(int i=0;i<lena;i++){
					int xor = a.charAt(i)^b.charAt(i);
					if(xor!=0){
						if(f==0){
							f = xor;
						}else if(s==0){
							s = xor;
						}else{
							System.out.println(0);
							print = true;
						}
						
					}
					
				}
				if(!print&&s!=0){
					System.out.println(1);
				}else{
					System.out.println(0);
				}
			}
		}
	}

}
