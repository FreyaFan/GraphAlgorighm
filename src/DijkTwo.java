import java.util.Arrays;
import java.util.Scanner;

public class DijkTwo {
public void dijktd(int[][] dtd, int startPoint){
	
	int m;
	int i,j,k;
	int minPath=999999999;
	int minPoint=0;
	
	/*System.out.println("Input the Rank");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int P[][]= new int[n][n];
	System.out.println("Input the value");
	for(i=0; i<n; i++){
		for(j=0;j<n;j++){
			P[i][j]=scan.nextInt();
		}
	}
	System.out.println("Input the startPoint");
	int startPoint = scan.nextInt();*/
	int n=dtd.length;
	int P[][]= new int[n][n];
	for(i=0;i<dtd.length;i++)	    	
		P[i]=Arrays.copyOf(dtd[i],dtd.length);
	
	
	int[] sLength = new int[n];        // store shortest length
	int[] path = new int[n];           // store last vest
	int[] tvest = new int[n];          // store test vest
	
	for(k=0; k<n; k++){                // store slength[],init path[],tvest[]
		sLength[k]=P[startPoint][k];
		path[k]=startPoint;
		tvest[k]=0;
		}
	
	tvest[startPoint]=1;
	path[startPoint]=0;

	for(i=0;i<n-1;i++){
		minPath=999999999;
	    for(k=0; k<n; k++){ 
		    if (sLength[k]<minPath && tvest[k]==0){
			   minPath=sLength[k];
			   minPoint=k;
			   }
	    }
		for(j=0;j<n;j++){		
		    if (sLength[j]>sLength[minPoint]+P[minPoint][j]){
			   sLength[j]=sLength[minPoint]+P[minPoint][j];
			   path[j]=minPoint;}
		}
		tvest[minPoint]=1;
	}
}
}
