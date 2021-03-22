package xunhuan5;
import java.util.Scanner;
public class Jinzita517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个1~15间的整数");
		int l=input.nextInt();
		for (int i=1;i<=l;i++) {
			for (int j=1;j<2*l;j++) { 
				if(Math.abs(j-l)>=i) {
					System.out.print(" ");
				}
				else {
					System.out.print(Math.abs(j-l)+1);
				}
			}
			System.out.println();
		}
	}

}
