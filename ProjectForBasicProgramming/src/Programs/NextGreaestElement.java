package Programs;

  
 
import java.util.Scanner;

  class NextGreaestElement {
	public static void main(String jd[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n;
			n = scan.nextInt();
			int a[] = new int[6];
			int x = 0;
			while(n>0){
				a[x++] = n%10;
				n/=10;
			}
			boolean done = false;
			for(int i=0;i<x;i++){
				for(int j=i+1;j<x;j++){
					if(a[j]<a[i]){
						int temp = a[j];
						a[j] = a[i];
						a[i] = temp;
						done = true;
						int min = a[i];
						int minIndex = -1;
						for(int k=0;k<i;k++){
						    if(a[k]<min){
						        min = a[k];
						        minIndex = k;
						    }
						}
						if(minIndex!=-1){
						     temp = a[minIndex];
						     a[minIndex] = a[i];
						     a[i] = temp;
						}
						break;
 					}
				}
				if(done){
					break;
				}
			}
			if(done){
				for(int i=x-1;i>=0;i--){
					System.out.print(a[i]);
				}
				System.out.println();
			}else{
				System.out.println("not possible");
			}
		}
	}

}
