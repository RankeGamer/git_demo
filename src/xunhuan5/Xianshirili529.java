package xunhuan5;
import java.util.Scanner;
public class Xianshirili529 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("请输入年份：");
		int year=input.nextInt();
		System.out.print("请输入该年第一天是周几：");
		int day=input.nextInt();
		
		//int year=2013;
		//int day=2;
		
		//n is monthName
		String n="";
		int d =0;
		for (int i=1;i<=12;i++) {
			switch(i) {
			case 1 :n="January";d=31;break;
			case 2 :n="February";
			if (i%400==0 || ((i%4==0) && (i%100!=0))) {
				d=29;
			}
			else {
				d=28;
			}
			break;
			case 3 :n="March";d=31;break;
			case 4 :n="April";d=30;break;
			case 5 :n="May";d=31;break;
			case 6 :n="June";d=30;break;
			case 7 :n="July";d=31;break;
			case 8 :n="August";d=31;break;
			case 9 :n="September";d=30;break;
			case 10 :n="October";d=31;break;
			case 11 :n="November";d=30;break;
			case 12 :n="December";d=31;break;			
			}
			String weekday="";
			
			
			System.out.printf("\n%20s %d \n   _________________________________\n   ",n,year);
			for(int j=0;j<7;j++) {
				switch(j) {
				case 1:weekday="Mon";break;
				case 2:weekday="Tue";break;
				case 3:weekday="Wed";break;
				case 4:weekday="Thu";break;
				case 5:weekday="Fri";break;
				case 6:weekday="Sat";break;
				case 0:weekday="Sun";break;
				}
				System.out.print(weekday+"  ");
			}
			System.out.println();
			for(int l=0;l<day;l++) {
				System.out.print("     ");
			}
			for(int k=1;k<=d;k++) {
				
				if((k+day)%7==0) {
					System.out.printf("%5d\n",k);
				}
				else {					
						System.out.printf("%5d",k);						
				}
			}
			
			day=day+d;
			day=day%7;
			System.out.println();
		}
		
		
		
	}

}
