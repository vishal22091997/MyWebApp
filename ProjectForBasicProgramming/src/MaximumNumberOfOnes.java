import java.util.Scanner;

public class MaximumNumberOfOnes {
	public static void main(String hd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt(), m = scan.nextInt();
			int[][] a = new int[n][m];
			int count = 0;
			int index = -1;
			for(int i=0;i<n;i++){
				int curCount = 0;
				for(int j=0;j<m;j++){
					int x = scan.nextInt();
					if(x==1){
						curCount++;
					}
				}
				if(curCount>count){
					count = curCount;
					index = i;
				}
			}
			System.out.println(index);
			 
		}
	}

}
