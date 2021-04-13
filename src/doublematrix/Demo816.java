package doublematrix;

import java.util.Arrays;

public class Demo816 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m= {
				{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}
		};
		
		int a=0; int b=0;
		for (int i=0;i<m.length;i++) {
			for(int j=m.length-1;j>i;j--) {
				if(m[j][0]<m[j-1][0]) {
					a=m[j][0]; b=m[j][1];
					m[j][0]=m[j-1][0]; m[j][1]=m[j-1][1];
					m[j-1][0]=a; m[j-1][1]=b;							
				}
			}
		}
		
		for (int i=0;i<m.length;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		//System.out.println(m[0]);
	}

}
