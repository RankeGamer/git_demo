package xunhuan5;

public class Jinzita519 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=8;i++) {
			for (int j=1;j<2*8;j++) {
				if(Math.abs(j-8)>=i) {
					System.out.print("    ");
				}
				else {
					int n=(i-Math.abs(j-8));
					System.out.printf("%4.0f",Math.pow(2, n));
				}
			}
			System.out.println();
		}
	}

}
