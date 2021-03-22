package xunhuan5;

public class Xianshirunnian527 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=1;
		int k=0;
		for(int i=101;i<=2100;i++) {
			if (i%400==0 || ((i%4==0) && (i%100!=0))) {
				k=k+1;
				if (j<10) {
					System.out.print(i+" ");
					j=j+1;
				}
				else {
					System.out.println(i+" ");
					j=1;
				}
				
			}
		}
		System.out.printf("\n在201~2100年中闰年的数目是%d个",k);
	}

}
