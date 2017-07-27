import java.util.Scanner;

public class NonRepeatingCharacter {
	public static void main(String dd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int [] a = new int[26];
			for(int i=0;i<26;i++){
				a[i] = -1;
			}
			String input = scan.next();
			for(int i = 0;i<n;i++){
				a[input.charAt(i)-'a']++;
			}
			boolean print = false;
			for(int i=0;i<n;i++){
				if(a[input.charAt(i)-'a']==0){
					System.out.println(Character.toChars(input.charAt(i)));
					print = true;
					break;
				}
			}
			if(!print){
				System.out.println(-1);
			}
		}
	}

}
