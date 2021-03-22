package xunhuan5;

public class Wanquanshu533 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<10000;i++) {
			int k=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					k=k+j;	
				}
			}
			if(k==i) System.out.println(i);	
		}
	} 

}
