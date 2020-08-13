package obectOrientedProgramming1;

//예제6-18 276p
public class PowerTest {

	public static void main(String[] args) {
		//x의 1승부터 x의 n승까지 구하기
		//x의 1승 x
		//x의 2승 x * x
		//x의 3승 x * x * x
		
		//만약 2의 4승을 구한다면
		// 32
		int result = 1;
		int x = 2;
		int n = 4;
		
		for(int i=0; i<=n; i++) {
			result *= x;
			System.out.printf("%d *= %d ",result,x);
			System.out.println();
			//result = result * x;
			// 2 = 1 * 2; --0
			// 4 = 2 * 2; --1
			// 8 = 4 * 2; --2
			// 16 = 8 * 2 ; --3
			// 32 = 16 * 2 ; --4
		}
		System.out.println("최종값 : " + result);
	}

	

}
