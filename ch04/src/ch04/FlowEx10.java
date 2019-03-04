
package ch04;

import java.util.*;

public class FlowEx10 {

	public static void main(String[] args) {
		
//		char grade = ' ';
//		
//		System.out.println("당신의 점수를 입력하세요.>");
//		Scanner scanner = new Scanner(System.in);
//		int score = scanner.nextInt();
//		
//		int rscore = (score/10);
//		
//		switch(rscore) {
//		
//			case 9:
//				grade = 'A';
//				break;
//			
//			case 8:
//				grade = 'B';
//				break;
//			
//			case 7:
//				grade = 'C';
//				break;
//			
//			default:
//				grade = 'F';
//		}
//	
//		System.out.printf("당신의 점수는 %c입니다	", grade);
		
	
		char grade = ' ';
		
		System.out.println("당신의 점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		switch(score/10) {
			case 10:
			case 9:
				grade = 'A';
				break;
				
			case 8:
				grade = 'B';
				break;
				
			default:
				grade = 'F';
		}
		
		System.out.println("당신의 학점은"+ grade + "입니다.");


	} 

}






