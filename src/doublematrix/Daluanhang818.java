package doublematrix;

public class Daluanhang818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]m= {
				{1,2},{3,4},{5,6},{7,8},{9,10}
		};
		shuffle(m);
		for (int i=0;i<m.length;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void shuffle(int[][] m) {
		int a=0; int b=0;
		for (int i=0;i<m.length;i++) {
			int j=(int)(Math.random()*m.length);
			a=m[j][0]; b=m[j][1];
			m[j][0]=m[i][0]; m[j][1]=m[i][1];
			m[i][0]=a; m[i][1]=b;	
		}
	}
}
