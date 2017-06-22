import java.util.Scanner;

public class ExtractMaximum {
	public static void main(String kk[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			String s = scan.next();
			String sam = "";
			int max = 0;
			for(int i=0, j=s.length();i<j;i++){
				char cur = s.charAt(i);
				if(cur>='0'&&cur<='9'){
					sam=sam+cur;
				}else{
					if(sam.length()>0){
						int samInt = Integer.parseInt(sam);
						if(samInt>max){
							max = samInt;
						}
						sam = "";
					}
				}
				if(i==j-1){
					if(sam.length()>0){
						int samInt = Integer.parseInt(sam);
						if(samInt>max){
							max = samInt;
						}
						sam = "";
					}
				}
			}
			System.out.println(max);
		}
	}

}
