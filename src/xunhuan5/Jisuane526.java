package xunhuan5;

public class Jisuane526 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e=0;
		for (int a=1;a<=10;a++) {
			e=0;
			double item=1;
			for (int i=1;i<=a*10000;i++) {
				e=e+item;
				item=item/i;				
			}
			System.out.println("µ±i="+a*10000+"Ê±£¬e="+e);
		}
	}

}
