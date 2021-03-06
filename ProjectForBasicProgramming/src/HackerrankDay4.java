import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HackerrankDay4 {
	 
	public static void main(String hd[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		int a[][] = new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				a[i][j] = scan.nextInt();
				
			}
		}
		int[] sam = new int[row*col];
		int maxArea = 0;
		int x1 = 0,y1 = 0,x2 = 0,y2 = 0;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				List<Integer> list = new ArrayList<Integer>();
				int k =row-1,l = col-1;
				for(k=row-1;k>=i;k--){
					for(l=col-1;l>=j;l--){
						if(list.contains(a[k][l])){
							list.remove(new Integer(a[k][l]));
						}else{
							list.add(a[k][l]);
						}
					}
				}
				System.out.println(list);
				if(list.size()<=1){
					int curArea = (k-i+1)*(l-j+1);
					if(curArea>maxArea){
						maxArea = curArea;
						x1 = i;
						y1 = j;
						x2 = k;
						y2 = l;
					}
				}
			}
		}
		System.out.println(maxArea);
		System.out.println(x1+" "+y1+" "+x2+" "+y2);
		
		
	}

}
