package xunhuan5;

public class Xuefei507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double money=10000;
		double sum=0;
		for (int i =0 ;i <10;i++) {
			money=money*1.05;
			if (i<4) sum=sum+money;		
		}
		System.out.println("ʮ���ѧ��Ϊ"+money);
		System.out.print("��������ѧ��Ϊ"+sum);
	}
 
}
