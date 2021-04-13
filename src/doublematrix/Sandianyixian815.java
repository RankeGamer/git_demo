package doublematrix;

import java.util.Scanner;

public class Sandianyixian815 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter five points:");
		double[][] m=new double[5][2];
		for (int i=0;i<5;i++) {
			for (int j=0;j<2;j++) {				
				m[i][j]=input.nextDouble();
			}
		}
		boolean f=sameLine(m);
		if (f) {
			System.out.println("The five points are on the same line");
		}
		else {
			System.out.println("The five points are not on the same line");
		}
	}
	public static boolean sameLine(double[][] points) {
		boolean f=true;
		for (int i=2;i<points.length;i++) {
			if(((points[1][0]-points[0][0])*(points[i][1]-points[0][1])-
					(points[i][0]-points[0][0])*(points[1][1]-points[0][1]))!=0) {
				f=false;
			}
		}
		return f;
	}
}
