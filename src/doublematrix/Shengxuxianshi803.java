package doublematrix;

public class Shengxuxianshi803 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] answers= {
				{'A','B','A','C','C','D','E','E','A','D'},
				{'D','B','A','B','C','A','E','E','A','D'},
				{'E','D','D','A','C','B','E','E','A','D'},
				{'C','B','A','E','D','C','E','E','A','D'},
				{'A','B','D','C','C','D','E','E','A','D'},
				{'B','B','E','C','C','D','E','E','A','D'},
				{'B','B','A','C','C','D','E','E','A','D'},
				{'E','B','E','C','C','D','E','E','A','D'}			
		};
		char[] keys= {'D','B','D','C','C','D','A','E','A','D'};
		int[] student=new int [8];
		for (int i=0;i<8;i++) {
			int grade=0;
			for (int j=0;j<10;j++) {
				if(answers[i][j]==keys[j]) {
					grade++;
				}
			}
			//²»½²ÎäµÂ
			student[i]=grade*100+i;		
		}
		java.util.Arrays.sort(student);
		for (int i=0;i<8;i++) {
			System.out.println("Student "+student[i]%100+"'s correct count is "+student[i]/100);
		}
		
	}
		
}
