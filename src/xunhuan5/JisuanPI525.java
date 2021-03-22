package xunhuan5;

public class JisuanPI525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=0;
		for (int a=1;a<=10;a++) {
			pi=0;
			for (int i=1;i<=a*10000;i++) {
				double j=i;				
				if(i%2!=0) {			
					pi=pi+1/(2*j-1);
				}
				else {
					pi=pi-1/(2*j-1);
				}
				
			}
			pi=pi*4;
			System.out.println("µ±i="+a*10000+"Ê±£¬¦Ð="+pi);
		}
		
	}

}
