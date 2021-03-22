package xunhuan5;
import java.util.Scanner;
public class Daiukuan522 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("请输入贷款总额");
		double amount=input.nextDouble();
		System.out.print("请输入贷款年限");
		int year=input.nextInt();
		System.out.print("请输入贷款利率");
		double rate=input.nextDouble();
		
		System.out.println("Loan Amount:"+amount);
		System.out.println("Nmber of year:"+year);
		System.out.printf("Annual Interest Rate:%.2f\n\n",rate);
		
		double j=rate/1200;
		double monthPay=(amount*j/(1-1/(Math.pow(1+j, year*12))));
		double totalPay=monthPay*year*12;
		
		System.out.println("Monthly Payment:"+monthPay);
		System.out.println("Total Payment:"+totalPay);
		System.out.printf("\nPayment#%19s%18s%21s\n","Inertest","Principal","balance");
		
		double balance=amount;
		double interest=0;
		double principal=0;
		int i=1;
		String payment="";
		do {
			int y=1+(i-1)/12;
			if ((i+12-y*12)<10){
				payment=y+"-0"+(i+12-y*12);
			}
			else {
				payment=y+"-"+(i+12-y*12);
			}
			
			
			interest=rate/1200*balance;
			principal=monthPay-interest;
			balance=balance-principal;
			
			System.out.printf("%s%20.2f%18.2f%24.2f\n",payment,interest,principal,balance);
			i++;			
		}while (i<=year*12);
	}

}
