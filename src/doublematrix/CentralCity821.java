package doublematrix;

import java.util.Scanner;

public class CentralCity821 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of cities:");
		int n=input.nextInt();
		System.out.print("Enter the coordinates of cities:");
		double[][] m=new double[n][2];
		for (int i=0;i<n;i++) {
			for (int j=0;j<2;j++) {				
				m[i][j]=input.nextDouble();
			}
		}
		//ndis{{¾àÀë,ÅÅÐò}¡­¡­}
		double[][] ndis=new double[n][2];
		for (int i=0;i<n;i++) {
			ndis[i][1]=i;
			for (int j=0;j<n;j++) {
				ndis[i][0]=ndis[i][0]+distance(m[i][0],m[i][1],m[j][0],m[j][1]);				
			}
		}
		sort(ndis);
		int l=(int)ndis[0][1];
		System.out.printf("The central city is at(%.2f,%.2f)\n",m[l][0],m[l][1]);
		System.out.printf("The total distance to all other cities is %.2f",ndis[0][0]);
		
		
		}
	public static double distance(double x1,double y1,double x2,double y2) {
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));		
	}
	
	public static void sort(double m[][]) {
		double a=0; double b=0;
		for (int i=0;i<m.length;i++) {
			for(int j=m.length-1;j>i;j--) {
				if(m[j][0]<m[j-1][0]) {
					a=m[j][0]; b=m[j][1];
					m[j][0]=m[j-1][0]; m[j][1]=m[j-1][1];
					m[j-1][0]=a; m[j-1][1]=b;								
				}
			}
		}
	}
}
