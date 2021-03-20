package new1;
import java.util.Scanner;
import java.math.*;
public class HelloWorld {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputt=new Scanner(System.in);
		System.out.print("输入半径");
		double r=inputt.nextDouble();
		double area=Math.pow(r, 2)*Math.PI;
		System.out.print("面积是"+area);
		
	}

}
