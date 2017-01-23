import java.util.Arrays;
import java.util.Scanner;

public class DijkOne {
	public void dijkod(int[][] dod,int st){
		int m;
		int i,j,k;
		int e=0,e1=0;
		int minPath=999999999;
		int mp=0;    //mp is minPoint
		int mpj=0;
		
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
		int st = scan.nextInt(); 		   //st is startPoint
		*/
		int n=dod.length;
		int P[][]= new int[n][n];
		for(i=0;i<dod.length;i++)	    	
			P[i]=Arrays.copyOf(dod[i],dod.length);
		
		int a = n*(n-1)/2;
		int A[] = new int[a];
		for(i=0; i<n; i++){
			for (j=0; j<i; j++){
				e=(i-1)*i/2+j;
				A[e]=P[i][j];
			}
		}
		
		int[] sLength = new int[n];        // store shortest length
		int[] path = new int[n];           // store last vest
		int[] tvest = new int[n];          // store test vest
		
		for(k=0; k<n; k++){                // store slength[],,
			path[k]=st;                    // init path[] as startPoint st;
			tvest[k]=0;   // init tvest[] equals 0; tvest store whether this point has been tested
			if(st>k){
				e1=st*(st-1)/2+k;}
			else if(st<k){
				e1=k*(k-1)/2+st;}
			if(k==st){
				sLength[k]=0;              // point to self-point equals to 0
			}
			else{
			sLength[k]=A[e1];}             // transform from two dimension to one dimension

		}
		
		tvest[st]=1;					   // startPoint is firstly to be tested
		
		
		
		for(i=0;i<n-1;i++){
			minPath=999999999;
		    for(k=0; k<n; k++){ 
			    if (sLength[k]<minPath && tvest[k]==0){
				   minPath=sLength[k];
				   mp=k;
				   }
		    }
			for(j=0;j<n;j++){
				if(mp>j){
					mpj=j+mp*(mp-1)/2;}
				else if(mp<j){
					mpj=mp+j*(j-1)/2;	
				}
			    if (sLength[j]>sLength[mp]+A[mpj]){
				   sLength[j]=sLength[mp]+A[mpj];
				   path[j]=mp;}
			}
			tvest[mp]=1;
		}
	}
}
