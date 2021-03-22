package xunhuan5;

public class Shangyeyingyong536 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.println("Enter the fitst 9 digits of an ISBN as integer");
		String isbn=input.next();
		int check=0;
		for (int i=0;i<9;i++) {						
			int c=Integer.parseInt(isbn.charAt(i)+"");
			check=check+c*(i+1); 
		}
		check=check%11;
		String ck="";
		ck=check+"";
		if (check==10) ck="X";		
		System.out.print(isbn+ck);
	}

}
