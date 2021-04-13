package doublematrix;

import java.util.Scanner;

public class Qiuhe801 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row:");
		double [][] m=new double[3][4] ;
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				m[i][j]=input.nextDouble();
			}
		}
		for(int k=0;k<4;k++) {
			double sum=sumColum(m,k);
			System.out.println("Sum of the elements at column "+k+" is "+sum);
		}
	}
	public static double sumColum(double[][] m , int columnIndex){
		
		double sum=0;
		for(int l=0;l<3;l++) {
			sum=sum+m[l][columnIndex];
		}
		return sum;

	}
}
