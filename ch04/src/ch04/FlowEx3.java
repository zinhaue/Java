// if문의 변형인 if-else문의 구조는 다음과 같다.
// if문에 'else블럭'이 더 추가되었다. 'else'의 뜻이 '그 밖의 다른'이므로 조건식의 결과가 참이 아닐 때, 즉 거짓일 때 else블럭의 문장을 수행하라는 뜻이다.
// if(조건식){
// }else{
// }
// 조건식의 결과에 따라 이 두개의 블럭{} 중 어느 한 블럭{}의 내용이 수행되고 전체 if문을 벗어나게 된다.
// 두 블럭{}의 내용이 모두 수행되거나, 모두 수행되지 않는 경우는 있을 수 없다. 
// 아래 왼쪽의 두 개의 if문을 if-else문으로 바꾸면 오른쪽과 같다.
// if(input == 0){
// 	System.out.println("0입니다.");
// } else {
//  System.out.println("0이 아닙니다.");
// }
// 왼쪽 코드의 두 조건식은 어느 한 쪽이 참이면 다른 한 쪽이 거짓인 상반된 관계에 있기 때문에 
// 오른쪽과 같이 if-else문으로 바꿀 수 있는 것이지, 두 개의 if문을 항상 if-else문으로 바꿀 수 있는 것은 아니다.
// 그리고 왼쪽의 코드는 두 개의 조건식을 계산해야지만, if-else문을 사용한 오른쪽의 코드는 하나의 조건식만 계산하면 되므로 더 효율적이고 간단하다.


package ch04;

import java.util.*;

public class FlowEx3 {

	public static void main(String[] args) {
		System.out.print("숫자를 하나 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		    System.out.printf("입력하신 숫자는 %d입니다." ,input);
		}

	}

}
