package xunhuan5;

public class Jisuanfangcha545 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.print("������ʮ�����֣��Կո����");
		String age=input.nextLine();		
		String[] ages=age.split(" ");
		//��ƽ������
		double ave=0;
		for (int i=0;i<10;i++) {
			ave=ave+Double.parseDouble(ages[i]);
		}
		ave=ave/10;
		System.out.printf("ƽ������Ϊ%.2f\n",ave);
		//�����䷽��
		double s=0;
		for (int i=0;i<10;i++) {
			s=s+Math.pow(ave-Double.parseDouble(ages[i]),2);					
		}
		s=Math.sqrt(s/9);	
		System.out.printf("�����׼��Ϊ%.5f",s);		
	}

}
