package doublematrix;

public class Sortttttttttttttttttttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void sort(int m[][]) {
		int a=0; int b=0;
		//按数组第一位排序
		for (int i=0;i<m.length;i++) {
			for(int j=m.length-1;j>i;j--) {
				if(m[j][0]<m[j-1][0]) {
					a=m[j][0]; b=m[j][1];
					m[j][0]=m[j-1][0]; m[j][1]=m[j-1][1];
					m[j-1][0]=a; m[j-1][1]=b;								
				}
			}
		}
		//在第一位相同情况下，按数组第二位排序
		for (int i=0;i<m.length;i++) {
			for(int j=m.length-1;j>i;j--) {
				if(m[j][1]<m[j-1][1] && m[j][0]==m[j-1][0]) {
					a=m[j][0]; b=m[j][1];
					m[j][0]=m[j-1][0]; m[j][1]=m[j-1][1];
					m[j-1][0]=a; m[j-1][1]=b;						
				}
			}
		}
	}
}
