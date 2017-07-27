import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class FindingTheNumbers {
	public static void main(String sj[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			Set<Integer> set = new HashSet<Integer>();
			for(int i=0,j=2*n+2;i<j;i++){
				int x = scan.nextInt();
				if(set.contains(x)){
					set.remove(x);
				}else{
					set.add(x);
				}
			}
			Iterator<Integer>it = set.iterator();
			int num1 = it.next(), num2 = it.next();
			if(num1>num2){
				System.out.println(num2+" "+num1);
			}else{
				System.out.println(num1+" "+num2);
			}
		}
	}

}
