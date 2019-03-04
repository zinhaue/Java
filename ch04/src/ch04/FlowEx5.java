// if문의 블럭 내에 또 다른 if문을 포함시키는 것이 가능한데 이것을 중첩 if문이라고 부르며 중첩의 횟수에는 거의 제한이 없다.
// if(조건식){
//		//조건식1의 연산결과사 true일 때 수행될 문장들을 적는다.
//		if(조건식2){
//			//조건식1과 조건식2가 모두 true일 때 수행될 문장들
//		}
//		else{
//		}
// }
// else{
// }
// 위와 같이 내부의 if문은 외부의 if문보다 안쪽으로 들여쓰기를 해서 두 if문의 범위가 명확히 구분될 수 있도록 작성해야 한다.
// 중첩if문에서는 괄호{}의 생략에 더욱 조심해야한다.
// 바깥쪽의 if문과 안쪽의 if문이 서로 엉켜서 if문과 else블럭의 관계가 의도한 바와 다르게 형성될 수도 있기 때문이다.

package ch04;

import java.util.*;

public class FlowEx5 {

	public static void main(String[] args) {
			int score = 0;
			char grade = ' ', opt = '0';
			
			System.out.println("당신의 점수를 입력하세요.>");
			
			Scanner scanner = new Scanner(System.in);
			score = scanner.nextInt();
			
			if(score >= 90) {
				grade='A';
				if(score >= 98) {
					opt='+';
				}
				else if(score <= 94) {
					opt='-';
				}
			}
			else if(score >= 80) {
				grade='B';
				if(score >= 85) {
					opt = '+';
				}
				else {
					opt='-';
				}
			}
			else {
				grade ='C';
			}
			
			System.out.printf("당신의 점수는 %c%c입니다.",grade,opt);
	} 

}


