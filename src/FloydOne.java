import java.awt.print.Printable;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;

public class FloydOne {
	public void floyod(int[][] od){
		
	    	/*
			
			
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
			int e=0;
			int n=od.length;
			int P[][]= new int[n][n];
			
			for(i=0;i<od.length;i++)	    	
				P[i]=Arrays.copyOf(od[i],od.length);

			
			int ai=0,aj=0;
			int a = n*(n-1)/2;
			int A[] = new int[a];
			
			for(i=0; i<n; i++){
				for (j=0; j<i; j++){
					e=(i-1)*i/2+j;
					A[e]=P[i][j];
				}
			}		
			for(k=0;k<n;k++)
				for(i=0;i<n;i++)
					for(j=0;j<i;j++){
						e=(i-1)*i/2+j;
					if(i>k){
						if(j>k){				
							ai=k+(i-1)*i/2;
							aj=k+(j-1)*j/2;
							if(( A[ai] != -1) && (A[aj] != -1) && ((A[e]>A[ai]+A[aj]) | (A[e] == -1))){
							A[e]=A[ai]+A[aj];}
						}
						else if(j<k){							
							ai=k+(i-1)*i/2;
							aj=j+(k-1)*k/2;
							if(( A[ai] != -1) && (A[aj] != -1) && ((A[e]>A[ai]+A[aj]) | (A[e] == -1))){
							A[e]=A[ai]+A[aj];}
							
						}
					}
					else if(i<k){
						if(j>k){
							ai=i+(k-1)*k/2;
							aj=k+(j-1)*j/2;	
							if(( A[ai] != -1) && (A[aj] != -1) && ((A[e]>A[ai]+A[aj]) | (A[e] == -1))){
							A[e]=A[ai]+A[aj];}
						}
						else if(j<k){
							ai=i+(k-1)*k/2;
							aj=j+(k-1)*k/2;
							if(( A[ai] != -1) && (A[aj] != -1) && ((A[e]>A[ai]+A[aj]) | (A[e] == -1))){
							A[e]=A[ai]+A[aj];}
						}
					}
					}

			
	    }
		
}