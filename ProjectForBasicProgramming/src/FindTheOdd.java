import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FindTheOdd {
	public static void main(String fjf[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			
			for(int i=0;i<n;i++ ){
				int x = scan.nextInt();
				if(list.contains(x)){
					list.remove(x);
				}else{
					list.add(x);
				}
			}
			System.out.println(list.get(0));
		}
	}

}
