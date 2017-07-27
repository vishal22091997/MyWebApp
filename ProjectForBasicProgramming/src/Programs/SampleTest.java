package Programs;

import java.util.Scanner;

public class SampleTest {
	public static void main(String sjs[]){
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		String arr[] = text.trim().split(" ");
		System.out.println(arr.length);
		String ans ;
		ans = "from Product where ";
		for(int i=0;i<arr.length;i++){
			ans+= "UPPER(name) like UPPER('%"+arr[i]+"%')";
			if(i!=arr.length-1){
				ans+=" OR ";
			}
		}
		System.out.println(ans);
	}

}
