package Programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MoveAllNegToEnd {
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			List<Integer> a = new ArrayList<Integer>();
			int y = 0;
			for(int i=0;i<n;i++){
				int x = scan.nextInt();
				if(x>0){
					System.out.print(x+" ");
				}else{
					a.add(x);
				}
			}
			Iterator<Integer> it = a.iterator();
			while(it.hasNext()){
				System.out.print(it.next()+" ");
			}
			System.out.println();
		}
	}

}