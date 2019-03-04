
package ch04;

import java.util.*;

public class FlowEx9 {

	public static void main(String[] args) {
		char grade =' ';
		System.out.println("당신의 점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		switch(score) {
			case 100: case 95:
				grade = 'A';
				break;
				
			case 85: case 80:
				grade = 'B';
				break;
				
			case 75: case 70:
				grade = 'C';
				break;
				
			default:
				grade = 'D';
		}
		System.out.println("당신의 점수는" + grade + "입니다.");
	} 

}




