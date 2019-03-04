
package ch04;

import java.util.*;

public class FlowEx8 {

	public static void main(String[] args) {
		System.out.print("당신의 주민번호를 입력하세요.(011231 - 1111222)");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		
		char gender = regNo.charAt(7);
		
		switch(gender) {
			case '2':
			case '4':
				System.out.println("당신은 여자입니다.");
				break;
			
			case '1':
			case '3':
				System.out.println("당신은 남자입니다.");
				break;
			
			default:
				System.out.println("잘못된 입력값입니다.");
		}
	} 

}




