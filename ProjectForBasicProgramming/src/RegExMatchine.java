import java.util.Scanner;

public class RegExMatchine {
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			String s = scan.next();
			String match = scan.next();
			int len = s.length();
			if(s.charAt(0)=='^'){
				if(match.indexOf(s.substring(1, len))==0){
					System.out.println(1);
				}else{
					System.out.println(0);
				}
			}else if(s.charAt(len-1)=='$'){
				if(match.indexOf(s.substring(0,len-1))==match.length()-len+1){
					System.out.println(1);
				}else{
					System.out.println(0);
				}
			}else{
				if(match.indexOf(s)!=-1){
					System.out.println(1);
				}else{
					System.out.println(0);
				}
			}
		}
	}

}
