import java.util.LinkedList;

public class LinkedLists {
	public LinkedList<int[]> SavingAsLinkedList(int n){
		LinkedList<int []> list=new LinkedList<int []>();
		CreateGraph CG=new CreateGraph();
		int [][]a=CG.DrawGraph(n);
		for(int i=0;i<n;i++)		
			list.add(a[i]);
		return list;
	}
	
	public LinkedList<int[]> SavingAsLinkedListCG(int n){
		LinkedList<int []> list=new LinkedList<int []>();
		CreateGraph CG=new CreateGraph();
		int [][]a=CG.CompleteGraph(n);
		for(int i=0;i<n;i++)		
			list.add(a[i]);
		return list;
	}
	
	public LinkedList<int[]> SavingAsLinkedListSG(int n){
		LinkedList<int []> list=new LinkedList<int []>();
		CreateGraph CG=new CreateGraph();
		int [][]a=CG.SparseGraph(n);
		for(int i=0;i<n;i++)		
			list.add(a[i]);
		return list;
	}
}
