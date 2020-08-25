package obectOrientedProgramming2;

//예제7-2. 346p
class Card1{
	final int NUMBER;	//상수지만 선언과 함께 초기화하지 않음
	final String KIND;	//생성자에서 단 한번 초기화 가능
	static int width = 100;
	static int height = 250;
	
	Card1(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Card1(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}
public class FinalCardTest {

	public static void main(String[] args) {
		Card1 c = new Card1("HEART",10);
		//c.NUMBER = 5; //상수는 한 번만 초기화 가능(위에서 생성자로 초기화진행)
		System.out.println (c.KIND);
		System.out.println (c.NUMBER);
		System.out.println (c.KIND);
	}

}
