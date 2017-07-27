package Programs;

import java.util.*;

public class CountDistinctInWindow {
	public static void main(String jdj[]){
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());
		while(t-->0){
			String st = scan.nextLine();
			Set<Character> set = new HashSet<Character>();
			for(int i=0,j=st.length();i<j;i++){
				char c = st.charAt(i);
				if(set.contains(c)){
					set.remove(new Character(Character.toLowerCase(c)));
				}else{
					System.out.print(c);
					set.add(Character.toLowerCase(c));
				}
			}
		}
		
	}

}
