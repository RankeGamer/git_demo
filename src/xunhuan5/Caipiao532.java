package xunhuan5;

public class Caipiao532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b=1;
		int a=0;
		do {
			a=(int)(Math.random()*100);
			if(a/10!=a%10) b=0;		
		}while(b==1);
		System.out.printf("%02d\n",a);
	}

}
