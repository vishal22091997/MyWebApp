import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
 
import java.util.StringTokenizer;

public class UNIONSET {
	public static void main(String jdj[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

	 
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			StringTokenizer nk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(nk.nextToken()), k = Integer.parseInt(nk.nextToken());
			 
			boolean arr[][] = new boolean[n][k];
			for(int i=0;i<n;i++){
				StringTokenizer leni = new StringTokenizer(br.readLine());
				int len = Integer.parseInt(leni.nextToken());
				 
				 
				for(int j=0;j<len;j++){
					int cur = Integer.parseInt(leni.nextToken());
					arr[i][cur-1] = true;
				}
				 
			}
			int count = 0;
			
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					boolean reach = true;
					for(int l=0;l<k;l++){
						if(!(arr[i][l]||arr[j][l])){
							reach = false;
							break;
						}
					}
					if(reach){
						count++;
					}
				}
				
				
				
				
			}
			System.out.println(count);
			
			
		}
	}

}
