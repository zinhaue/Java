package ch04;

import java.util.*;

public class FlowEx11 {

	public static void main(String[] args) {
//		System.out.println("당신의 주민등록번호를 입력하세요.>(123456-1111222)");
//		
//		Scanner scanner = new Scanner(System.in);
//		String regNo = scanner.nextLine();
//		char number = regNo.charAt(7);
//		
//		if(number=='2' || number=='4') {
//			System.out.println("당신은 여자입니다.");
//		}
//		
//		else if (number=='1' || number=='3'){
//			System.out.println("당신은 남자입니다.");
//		}
//		
//		else {
//			System.out.println("잘못된입력값입니다.");
//		}

		
		
		
		System.out.println("당신의 주민등록번호를 입력하세요.>(123456-1111222)");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		char number = regNo.charAt(7);
		
		switch(number) {
			case '2':
			case '4':
				switch(number) {
					case '2':
						System.out.println("당신은 2000년도 이전 출생한 여자입니다.");
						break;
					
					default:
						System.out.println("당신은 2000년도 이후 출생한 여자입니다.");
				}
				break;
			
			case '1':
			case '3':
				switch(number) {
				case '1':
					System.out.println("당신은 2000년도 이전 출생한 자입니다.");
					break;
				
				default:
					System.out.println("당신은 2000년도 이후 출생한 자입니다.");
			}
			break;
		}
	} 

}




