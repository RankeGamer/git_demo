package doublematrix;

import java.util.Scanner;

public class Dingweizuida813 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the array:");
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.print("Enter the array:");
		double[][] m=new double[a][b];
		for (int i=0;i<a;i++) {
			for (int j=0;j<b;j++) {				
				m[i][j]=input.nextDouble();
			}
		}
		System.out.print("The location of the latgest element is at ("+locateLargest(m)[0]+","+locateLargest(m)[1]+")");
	}
	public static int[] locateLargest(double[][] a) {
		double max=0;
		int x=0,y=0;
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				if (a[i][j]>max) {
					max=a[i][j];
					x=i; y=j;					
				}
			}
		}
		int[] b= {x,y};
		return b;
	}
}
