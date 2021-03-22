package xunhuan5;
import java.util.Scanner;
public class Daiukuan521 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请输入贷款总额");
		double amount=input.nextDouble(); 
		System.out.print("请输入贷款年限");
		int year=input.nextInt();
		//System.out.println("lll"+amount);
		System.out.println("Loan Amount:"+amount);
		System.out.println("Nmber of year:"+year);
		System.out.printf("%s%20s%20s\n","Inertest Rate","Monthly Payment","Total Payment");
		
		double i=5;
		do {
			double j=i/1200;
			//double a=amount*j;
			//double b=(Math.pow(1+j, year*12));
			//System.out.printf("a=%.2fb=%.2f\n",a,b);
			double monthPay=(amount*j/(1-1/(Math.pow(1+j, year*12))));
			double totalPay=monthPay*year*12;
			System.out.printf("%.3f%%%18.2f%24.2f\n",i,monthPay,totalPay);
			i=i+0.125;
					
			
		}while (i<=8);
	}

}
