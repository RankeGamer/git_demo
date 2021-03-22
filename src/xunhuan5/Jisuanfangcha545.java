package xunhuan5;

public class Jisuanfangcha545 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.print("请输入十个数字，以空格隔开");
		String age=input.nextLine();		
		String[] ages=age.split(" ");
		//求平均年龄
		double ave=0;
		for (int i=0;i<10;i++) {
			ave=ave+Double.parseDouble(ages[i]);
		}
		ave=ave/10;
		System.out.printf("平均年龄为%.2f\n",ave);
		//求年龄方差
		double s=0;
		for (int i=0;i<10;i++) {
			s=s+Math.pow(ave-Double.parseDouble(ages[i]),2);					
		}
		s=Math.sqrt(s/9);	
		System.out.printf("年龄标准差为%.5f",s);		
	}

}
