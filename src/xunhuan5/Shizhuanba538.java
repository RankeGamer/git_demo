package xunhuan5;

public class Shizhuanba538 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.println("请输入一个十进制整数：");
		int dec=input.nextInt();
		if (dec<8) {
			System.out.print(dec);
		}
		else {
			String oct="";
			do {
				oct=dec%8+oct;
				dec=dec/8;
			}while(dec)>7);
				System.out.println("1"+oct);				
		}				
	}

}
