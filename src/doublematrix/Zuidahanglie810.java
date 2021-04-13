package doublematrix;

public class Zuidahanglie810 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix=new int[4][4];
		int[] maxr=new int[4];
		int[] maxc=new int[4];
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				int k=(int) Math.round(Math.random());
				matrix[i][j]=k;
				System.out.print(matrix[i][j]);
				maxr[i]=maxr[i]+k;
			}
			System.out.println();
			//System.out.println("max="+maxr[i]);

		}
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				maxc[i]=maxc[i]+matrix[j][i];
			}
			//System.out.print("maxc="+i+" "+maxc[i]);
		}
		int largestRow=0;
		int largestColumn=0;
		for (int i=0;i<4;i++) {
			if(maxr[i]>maxr[largestRow]) {
				largestRow=i;
			}
			if(maxc[i]>maxc[largestColumn]) {
				largestColumn=i;				
			}
		}
		System.out.println("The largest row index:"+largestRow);
		System.out.println("The largest column index:"+largestColumn);
		
	}

}
