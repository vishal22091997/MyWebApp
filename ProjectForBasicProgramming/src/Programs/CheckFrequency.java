package Programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CheckFrequency {
	public static void main(String sh[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			String s = scan.next();
			int a[] = new int[26];
			for(int i=0,j=s.length();i<j;i++){
				a[s.charAt(i)-'a']++;
			}
			Set<Integer> set = new HashSet<Integer>();
			for(int i=0;i<26;i++){
				if(a[i]!=0){
					set.add(a[i]);
				}
			}
			if(set.size()>2){
				System.out.println(0);
			}else if(set.size()==1){
				System.out.println(1);
			}
			else{
				 int count1 =0, count2 = 0;
				 Iterator<Integer> it = set.iterator();
				 int val1 = it.next();
				 int val2 = it.next();
				 for(int i=0;i<26;i++){
					 if(a[i]==val1){
						 count1++;
					 }else if(a[i]==val2){
						 count2++;
					 }
				 }
				 if(Math.abs(val2-val1)<=1&&(count1==1||count2==1)){
					 System.out.println(1);
				 }else{
					 System.out.println(0);
				 }
			}
		}
	}

}
