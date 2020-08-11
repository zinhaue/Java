// if문은 조건식의 결과가 참과 거짓, 두 가지 밖에 없기 때문에 경우의 수가 많아질수록 else-if를
// 계속 추가해야하므로 조건식이 많아져서 복잡해지고, 여러 개의 조건식을 계산해야하므로 처리시간도 많이 걸린다.
// 이러한 if문과 달리 switch문은 단 하나의 조건식으로 많은 경우의 수를 처리할 수 있고,
// 표현도 간결하므로 알아보기 쉽다. 
// 그래서 처리할 경우의 수가 않은 경우에는 if문 보다 switch문으로 작성하는 것이 좋다.
// 다만 switch문은 제약조건이 있기 때문에, 경우의 수가 많아도 어쩔 수 없이 if문으로 작성해야 하는 경우가 있다.
// switch문은 조건식을 먼저 계산한 다음, 그 결과와 일치하는 case문으로 이동한다. 이동한 case문 아래에 있는 문장들을 수행하며,
// break문을 만나면 전체 switch문을 빠져나가게 된다.
// 1.조건식을 계산한다.
// 2.조건식의 결과와 일치하는 case문으로 이동한다.
// 3.이후의 문장들을 수행한다.
// 4.break문이나 switch문의 끝을 만나면 switch문 전체를 빠져나간다.
//	switch(조건식){
//		case 값1 :
//			// 조건식의 결과가 값1과 같을 경우 수행될 문장들
//			// ...
//			break;
//		case 값2 :
//			// 조건식의 결과가 값2와 같을 경우 수행될 문장들
//			// ... 
//			break;
//		default;
//			// 조건식의 결과와 일치하는 case문이 없을 때 수행될 문장들
//			// ...
//	}
// 만일 조건식의 결과와 일치하는 case문이 하나도 없는 경우에는 default문으로 이동한다.
// default문은 if문의 else블럭과 같은 역할을 한다고 보면 이해가 쉬울 것이다. 
// default문의 위치는 어디라도 상관없으나 보통 마지막에 놓기 때문에 break문을 쓰지 않아도 된다.
// switch문에서 break문은 각 case문의 영역을 구분하는 역할을 하는데, 만일 break문을 생략하면 
// case문 사이의 구분이 없어지므로 다른 break문을 만나거나 switch문 블럭{}의 끝을 만날 때까지
// 나오는 모든 문장들을 수행한다. 
// 이러한 이유로 각 case문의 마지막에 break문을 빼먹는 실수를 하지 않도록 주의해야한다.
// 그러나 경우에 따라서는 다음과 같이 고의적으로 break문을 생략하는 경우도 있다.

package ch04;

import java.util.*;

public class FlowEx6 {

	public static void main(String[] args) {
		int month;
		String season = " ";
		
		System.out.print("현재 월을 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		month = scanner.nextInt();
		
		switch(month){
			case 3:
			case 4:
			case 5:
				season = "봄";
				break;
			
			case 6:
			case 7:
			case 8:
				season = "여름";
			    break;
		
			case 9:
			case 10:
			case 11:
				season = "가을";
				break;
				
			case 12:
			case 1:
			case 2:
				season = "겨울";
				break;
				
			default:
			    
		}
		System.out.printf("현재계절은 %s입니다.",season);
	} 

}


