import java.util.Scanner;
import java.util.*;

public class AGoodSet {
	public static void main(String gj[]){
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while(q-->0){
			int n = scan.nextInt();
			 ;
			if(n==1){
				System.out.println(1);
			}else if(n==2){
				System.out.println(1 + " "+2+" ");
			}else{
				System.out.print(1+" "+2+" "+4+" ");
				int last = 4;
				int slast = 2;
				int tlast = 1;
				List<Integer> list = new ArrayList<Integer>();
				list.add(1);
				list.add(2);
				list.add(4);
				int count = 3;
				for(int i=5;i<=500;i++){
					int rem = i-last;
					if(!list.contains(rem)){
						list.add(i);
						last = i;
						count++;
						System.out.print(i+" ");
					}
					if(count==n){
						break;
					}
				}
				System.out.println();
			}
		}
	}

}
