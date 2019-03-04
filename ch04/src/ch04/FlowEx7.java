// 가위바위보

package ch04;

import java.util.*;

public class FlowEx7 {

	public static void main(String[] args) {
		int mine;
		
		System.out.println("가위(1),바위(2),보(3)를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		mine = scanner.nextInt();
		if(mine==1) {
			System.out.println("당신은 가위입니다.");
		}
		else if(mine==2) {
			System.out.println("당신은 바위입니다.");
		}
		else if(mine==3) {
			System.out.println("당신은 보입니다.");
		}
		
		else {
			System.out.println("잘못된값입니다.");
			return;
		}
		
		int comput = (int)(Math.random() * 3) +1;
		if(comput==1) {
			System.out.println("컴퓨터는 가위입니다.");
		}
		else if(comput==2) {
			System.out.println("컴퓨터는 바위입니다.");
		}
		else {
			System.out.println("컴퓨터는 보입니다.");
		}
		
		int our = mine-comput;
		
		switch(our) {
			case 0:
				System.out.println("당신은 비겼습니다.");
				break;
			
			case -1:
			case 2:
				System.out.println("당신은 졌습니다.");
				break;
				
			default:	
			case -2:
			case 1:
				System.out.println("당신은 이겼습니다.");
				
		}
	} 

}

// 이 예제는 컴퓨터와 사용자가 가위바위보를 하는 간단한 게임이다. 사용자로부터 1(가위),2(바위),3(보) 중의 하나를 입력받고,
// 컴퓨터는 1,2,3 중에서 하나를 임의로 선택한다.
// 난수(임의의 수)를 얻기 위해서는 Math.random()을 사용해야 하는데, 이 메서드는 0.0과 1.0사이의 범위에 속하는 하나의 double값을 반환한다.
// 0.0은 범위에 포함되고 1.0은 포함되지 않는다.
// 0.0 <= Math.random() < 1.0
// 만일 1과 3사이의 정수를 구하기를 원한다면, 다음과 같은 과정으로 난수를 구하는 식을 얻을 수 있다.
// 1.각 변에 3을 곱한다.
//					0.0 * 3 <= Math.random() * 3 < 1.0 * 3
//						0.0 <= Math.random() * 3 < 3.0
// 2.각 변을 int형으로 변환한다.
//				   (int)0.0 <= (int)(Math.random() * 3) < (int)3.0
//						  0 <= (int)(Math.random() * 3) < 3
// 3.각 변에 1을 더한다.
//					  0 + 1 <= (int)(Math.random() * 3) + 1 < 3 + 1
//						  1 <= (int)(Math.random() * 3) + 1 < 4
// 자, 이제는 1과 3사이의 정수 중 하나를 얻을 수 있다. 1은 포함되고 4는 포함되지 않는다.
// 위와 같은 방식으로 식을 변환해가며 범위를 조절하면 원하는 범위의 값을 얻을 수 있다.
// 주사위를 던졌을 때 나타나는 임의의 값을 얻기 위해서는 3대신 6을 곱하면 된다.
// 그렇게하면 1과 6사이의 값을 얻어낼 수 있을 것이다.
// 이제 사용자가 입력한 값하고 컴퓨터가 생성한 난수하고 비교해서 가위바위보의 승부결과를 판단해야한다.
// 두 값 모두 3가지 값이 가능하므로, 아래의 표와 같이 모두 9가지의 경우의 수를 처리해야한다.



