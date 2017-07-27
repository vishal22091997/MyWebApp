package Programs;

import java.util.*;

class ClosestStrings {
	  public static void main(String dj[]){
		  Scanner scan = new Scanner(System.in);
		  int t = scan.nextInt();
		  while(t-->0){
			  int n = scan.nextInt();
			  String a[] = new String[n+2];
			  for(int i=0;i<n;i++){
				  a[i] = scan.next();
			  }
			  a[n] = scan.next();
			  a[n+1] = scan.next();
			  int f = -1, s = -1, dis = 1000000;
			  if(a[n].equals(a[n+1])){
				  System.out.println(0);
			  }else{
				  for(int i=0;i<n;i++){
					  if(a[i].equals(a[n])){
						  if(s!=-1){
							  if(i-s<dis){
								  dis = i-s;
								  f = i;
							  }
						  }else{
							  f = i;
						  }
					  }else if(a[i].equals(a[n+1])){
						  if(f!=-1){
							  if(i-f<dis){
								  dis = i-f;
								  s = i;
							  }
						  }else{
							  s = i;
						  }
					  }
				  }  
				  System.out.println(dis);
			  }
			 
			   
			  
		  }
	  }

}
