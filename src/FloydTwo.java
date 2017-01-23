import java.util.Arrays;
import java.util.Scanner;

public class FloydTwo {
	 public void floytd(int[][] td){
		
	    	/*		
			int a1,a2;		
			System.out.println("Input the Rank");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int P[][]= new int[n][n];
			System.out.println("Input the value");
			
			for(i=0; i<n; i++){
				for(j=0;j<n;j++){
					P[i][j]=scan.nextInt();
				}
			}*/	 
		    int m=0;
			int i=0,j=0,k=0;
		    int n=td.length;
		    int P[][]= new int[n][n];
		    FloydTwo ft = new FloydTwo();
		    for(i=0;i<td.length;i++)	    	
				P[i]=Arrays.copyOf(td[i],td.length);

			for(k=0;k<n;k++)
				for(i=0;i<n;i++)
					for(j=0;j<n;j++)
					if(( P[i][k] != -1) && (P[k][j] != -1) && ((P[i][j]>P[i][k]+P[k][j]))
							| (P[i][j] == -1)){
						P[i][j]=P[i][k]+P[k][j];
					}					
	    }
		
}
