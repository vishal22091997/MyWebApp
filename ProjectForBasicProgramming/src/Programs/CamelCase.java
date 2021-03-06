package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CamelCase {
	public static String makeIt(String s){
		String ans = "";
		for(int i=0,j=s.length();i<j;i++){
			if(Character.isUpperCase(s.charAt(i))){
				ans+=s.charAt(i);
			}
		}
		return ans;
	}
	public static void main(String hg[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			List<HashSet<Integer>> list = new ArrayList<HashSet<Integer>>();
			for(int i=0;i<n;i++){
				HashSet<Integer> set = new HashSet<Integer>();
				for(int j=0;j<n;j++){
					set.add(scan.nextInt());
				}
				list.add(i, set);
			}
			Iterator<Integer> it = list.get(0).iterator();
			int count = 0;
			while(it.hasNext()){
				int check = it.next();
				for(int i=1,j=list.size();i<j;i++){
					if(!list.get(i).contains(check)){
						break;
					}
					if(i==j-1){
						count++;
					}
				}
			}
			System.out.println(count);
		}
		
	}

}
