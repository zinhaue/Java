package obectOrientedProgramming1;

public class PowerTest2 {

	public static void main(String[] args) {
		//x의 n승 구하기
		int x = 2; 
		int n = 5;
		
		System.out.println("결과" + power(x,n+1));

	}
	static int power(int number ,int jegob) {
		int result = number;
		if(jegob == 1) {
			return result;
		} else {
			result *= power(number,jegob-1);
			return result;
		}
		// result *= factorial(3); --factorial(4)
		// result *= factorial(2); --factorial(3)
		// result *= factorial(1); --factorial(2)
		// factorial(1) = 2 --factorial(1)
	}

}
