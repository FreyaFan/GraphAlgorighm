import java.util.LinkedList;
import java.util.Scanner;

public class implement {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please input the number of nodes");
		int n=input.nextInt();
		input= new Scanner(System.in);
		System.out.println("Please input vertice number for the beginning");
		int q=input.nextInt()-1;

		LinkedLists ll= new LinkedLists();
		CreateGraph cg = new CreateGraph();
		int[][] gra = cg.CompleteGraph(n);
		int[][] sgr = cg.SparseGraph(n);
		
		                     // Floyd' for Completed & Sparse Graph	
		FloydOne od = new FloydOne();
		
		long starttime=System.currentTimeMillis();
		od.floyod(gra);
		long endtime=System.currentTimeMillis();
		long result1=endtime-starttime;
		System.out.println("Time cost for FloydForOneDimensionalArray is "+result1);
		
			
		FloydTwo ft = new FloydTwo();
		starttime=System.currentTimeMillis();
		ft.floytd(gra);
		endtime=System.currentTimeMillis();
		long result2=endtime-starttime;
		System.out.println("Time cost for FloydForTwoDimensionalArray is "+result2);
		
		
		FloydLinked fl = new FloydLinked();
		starttime=System.currentTimeMillis();
		fl.floyll(gra);
		endtime=System.currentTimeMillis();
		long result3=endtime-starttime;
		System.out.println("Time cost for FloydForLinkedListArray is "+result3);
		
		
		starttime=System.currentTimeMillis();
		od.floyod(sgr);
		endtime=System.currentTimeMillis();
		long result4=endtime-starttime;
		System.out.println("Time cost for FloydForOneDimensionalArray(Sparse) is "+result4);
		
		
		starttime=System.currentTimeMillis();
		ft.floytd(sgr);
		endtime=System.currentTimeMillis();
		long result5=endtime-starttime;
		System.out.println("Time cost for FloydForTwoDimensionalArray(Sparse) is "+result5);
		
		starttime=System.currentTimeMillis();
		fl.floyll(sgr);
		endtime=System.currentTimeMillis();
		long result6=endtime-starttime;
		System.out.println("Time cost for FloydForLinkedListArray is(Sparse) "+result6);
		
		
		    					// Dijikstra' for Complete Graph
		
		
		DijkOne dod = new DijkOne();
		starttime=System.currentTimeMillis();
		dod.dijkod(cg.CompleteGraph(n),q);
		endtime=System.currentTimeMillis();
		long result7=endtime-starttime;
		System.out.println("Time cost for DijkstraOneDimArray is "+result7);
		
		DijkTwo dt = new DijkTwo();
		starttime=System.currentTimeMillis();
		dt.dijktd(cg.CompleteGraph(n),q);
		endtime=System.currentTimeMillis();
		long result8=endtime-starttime;
		System.out.println("Time cost for DijkstraTwoDimArray is "+result8);
		
		
		DijkLink dl = new DijkLink();
		starttime=System.currentTimeMillis();
		dl.dijkll(cg.CompleteGraph(n),q);
		endtime=System.currentTimeMillis();
		long result9=endtime-starttime;
		System.out.println("Time cost for DijkstraLinkedListArray is "+result9);
		
		
		starttime=System.currentTimeMillis();
		dod.dijkod(cg.SparseGraph(n),q);
		endtime=System.currentTimeMillis();
		long result10=endtime-starttime;
		System.out.println("Time cost for DijkstraOneDimArray(Sparse) is "+result10);
		
		starttime=System.currentTimeMillis();
		dt.dijktd(cg.SparseGraph(n),q);
		endtime=System.currentTimeMillis();
		long result11=endtime-starttime;
		System.out.println("Time cost for DijkstraTwoDimArray(Sparse) is "+result11);
		
		
		starttime=System.currentTimeMillis();
		dl.dijkll(cg.SparseGraph(n),q);
		endtime=System.currentTimeMillis();
		long result12=endtime-starttime;
		System.out.println("Time cost for DijkstraLinkedListArray(Sparse) is "+result12);
		
		
		
	}
}
