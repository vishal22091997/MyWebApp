import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PatternSearching {
	public static void main(String jd[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		String s = new String(st.nextToken());
		while(t-->0){
			st = new StringTokenizer(br.readLine());
			String n = new String(st.nextToken());
			if(s.indexOf(n)!=-1){
				System.out.println("found");
			}else{
				System.out.println("not found");
			}
		}
	}

}
