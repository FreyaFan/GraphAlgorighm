import java.util.Random;

public class CreateGraph {

		public int[][] DrawGraph(int n){
			int i,j;
			int sum1,sum2;
			int p=0,q=0;
			int [][]a= new int[n][n];
			Random random=new Random();
			do{
				for(i=0;i<n;i++){
					for(sum1=0,j=i+1;j<n;j++){
						a[i][j]=Math.abs(random.nextInt(6000));
						sum1=sum1+a[i][j];
						if(a[i][j]==0)
							p++;
						a[j][i]=a[i][j];
					}					
					if(sum1==0){
						sum2=0;
						for(q=i;q>=0;q--){
							sum2=sum2+a[q][i];
						}
						if(sum2==0)
							p=n-1;
					}
				}
			}
			while(p>=n-1);
			return a;
		}
		
		
		public int[][] CompleteGraph(int n){
			int i,j;
			int [][]a= new int[n][n];
			Random random=new Random();
			for(i=0;i<n;i++)
				for(j=i+1;j<n;j++){
					a[i][j]=Math.abs(random.nextInt(6000)+1);
					a[j][i]=a[i][j];
				}
			return a;
		}
		
		public int[][] SparseGraph(int n){
			int i,j;
			int sum1,sum2;
			int p=0,q=0,f=0;
			int [][]a= new int[n][n];
			Random random=new Random();
			
		
			for(i=0;i<n-1;i++){
				for(j=i+1;j<n;j++){
					a[i][j]=Math.abs(random.nextInt(100)) + 1;
					a[j][i]=a[i][j];
					
				}
				f = 1;
				for(j=0; j<i; j++){
					if (a[i][j]==0){
						f = 0;
					}
				}
				if (f == 1){
					j = i + 1 + Math.abs(random.nextInt(n - i - 2));
					a[i][j] = 0;
					a[j][i] = 0;
				}
			}
			
			for(i=0;i<a.length;i++)
				for(j=0;j<a.length;j++){
					if (i!=j)
					  if(a[i][j]==0){
						  a[i][j]=999999999;
				}
			}
			return a;
			
					
		}
		
	}


