// if-else문은 두 가지 경우 중 하나가 수행되는 구조인데, 처리해야할 경우의 수가 셋 이산인 경우에는 어떻게 해야할까?
// 그럴 때는 한 문장에 여러 개의 조건식을 쓸 수 있는 사용하면 된다.
// 첫번째 조건식부터 순서대로 평가해서 결과가 참인 조건식을 만나면, 해당 블럭만 수행하고 전체를 벗어난다.
// 만일 결과가 참인 조건식이 하나도 없으면, 마지막에 있는 블럭의 문장들이 수행된다, 그리고 블럭은 생략이 가능하다.
// 블럭이 생략되었을 때는 어떤 블럭도 수행되지 않을 수 있다.
// 

package ch04;

import java.util.*;

public class FlowEx4 {

	public static void main(String[] args) {
		int score =0;
		char grade = ' ';
		
		System.out.println("점수를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score > 90) {
			grade = 'A';
			
		}
		else if(score > 80) {
			grade = 'B';
		}
		else if(score >70) {
			grade = 'C';
		}
		else {
			grade = 'D';
		}
		System.out.println("당신의 학점은" + grade + "입니다.");
		System.out.printf("당신의 학점은 %c입니다." ,grade);
	}

}

// 점수를 입력하면, 그에 해당하는 학점을 출력하는 간단한 예제이다. 여기서 한가지 눈여겨봐야할 것은 두번째와 세번째 조건식이다.
