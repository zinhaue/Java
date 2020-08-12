package obectOrientedProgramming1;
//예제6-8 263p
public class CallStackTest {

	public static void main(String[] args) {
		System.out.println("main() 시작");
		firstMethod();	//static메서드는 객체 생성없이 호출가능
		System.out.println("main() 끝");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod() 시작");
		secondMethod();
		System.out.println("firstMethod() 끝");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod() 시작");
		System.out.println("secondMethod() 끝");
	}

}
