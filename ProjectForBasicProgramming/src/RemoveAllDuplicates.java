import java.util.Scanner;

public class RemoveAllDuplicates {
	public static void main(String jdj[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			String s = scan.next();
			int a[] = new int[128];
			 
			for(int i=0,j=s.length();i<j;i++){
				char cur = s.charAt(i);
				int curPos = s.charAt(i);
				if(a[curPos]==0){
					System.out.print(cur);
					a[curPos]++;
				}
			}
			System.out.println();
		}
	}

}
