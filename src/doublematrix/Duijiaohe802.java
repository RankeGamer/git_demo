package doublematrix;

import java.util.Scanner;

public class Duijiaohe802 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row:");
		double [][] m=new double[4][4] ;
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				m[i][j]=input.nextDouble();
			}
		}
		System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(m));
	}
	public static double sumMajorDiagonal(double[][] m) {
		double sum=0;
		for (int i=0;i<4;i++) {
			sum=sum+m[i][i];			
		}
		return sum;
	}

}
