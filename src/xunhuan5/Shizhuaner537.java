package xunhuan5;

public class Shizhuaner537 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.println("������һ��ʮ����������");
		int dec=input.nextInt();
		if (dec==1 ||dec==0) {
		}
		else {
			int i=2;
			String bin="";
			do {
				bin=dec%2+bin;
				dec=dec/2;
			}while(dec>1);
				System.out.println("1"+bin);				
		}				
	}

}
