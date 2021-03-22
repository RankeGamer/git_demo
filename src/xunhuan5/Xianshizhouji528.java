package xunhuan5;
import java.util.Scanner;
public class Xianshizhouji528 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请输入年份：");
		int year=input.nextInt();
		System.out.print("请输入该年第一天是周几：");
		int day=input.nextInt();
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
			switch(day) {
			case 1:weekday="Monday";break;
			case 2:weekday="Tuesday";break;
			case 3:weekday="Wednesday";break;
			case 4:weekday="Thursday";break;
			case 5:weekday="Friday";break;
			case 6:weekday="Saturday";break;
			case 0:weekday="Sunday";break;
			}
			System.out.printf("%s 1,%d is %s\n",n,year,weekday);
			day=day+d;
			day=day%7;
			
		}
		
		
		
	}

}
