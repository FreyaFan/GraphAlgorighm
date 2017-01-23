import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;

public class FloydLinked {
	public void floyll(int[][] fl){
		
		
		/*System.out.println("Input the Rank");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();				//n is the rank of matrix
		int P[][]= new int[n][n];           //P[][] is the value of matrix
		System.out.println("Input the value");
		for(i=0; i<n; i++){
			for(j=0;j<n;j++){
				P[i][j]=scan.nextInt();
			}
		}*/
		int m=0;							//
		int i=0,j=0,k=0;					//i is row index, j is column index
		int e=0;							//e is one-dimension index
		int ai=0,aj=0;
		int n=fl.length;
		int P[][]= new int[n][n];
		for(i=0;i<fl.length;i++)	    	
			P[i]=Arrays.copyOf(fl[i],fl.length);
		
		LinkedList<Integer> A=new LinkedList<Integer>();
			
				for(i=0; i<n; i++){
					for (j=0; j<i; j++){
						e=(i-1)*i/2+j;
						A.add(P[i][j]);
					}
				}

		for(k=0;k<n;k++)					//Floyd's Algorithm
			for(i=0;i<n;i++)
				for(j=0;j<i;j++){
					e=(i-1)*i/2+j;						
						if(i>k){
							ai=k+(i-1)*i/2;}
						else if(i<k){
							ai=i+(k-1)*k/2;}
						if(j>k){
							aj=k+(j-1)*j/2;}
						else if(j<k){
							aj=j+(k-1)*k/2;}
						if(( A.get(ai) != -1) && (A.get(aj) != -1) && ((A.get(e)>A.get(ai)+A.get(aj)) | (A.get(e) == -1))){	
							A.set(e,(A.get(ai)+A.get(aj)));
							}	
															
				}

}
}
