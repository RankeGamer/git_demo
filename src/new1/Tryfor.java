package new1;
import java.math.*;
public class Tryfor {
	public static void main(String[] args) {
		int i;
		int j;
		for (i=0;i<=20;i++) {
			for (j=0;j<Math.abs(i-10);j++) {
				System.out.print("    ");
			}
			for (j=0;j<=2*(10-Math.abs(10-i));j++) {
				System.out.print("¡ù");
			}
			System.out.println();
		}
	}

}
