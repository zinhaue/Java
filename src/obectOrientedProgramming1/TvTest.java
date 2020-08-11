package obectOrientedProgramming1;

class Tv {
	//Tv의 속성(멤버변수)
	String color;	//색상
	boolean power;	//전원상태
	int channel;	//채널
	
	//Tv의 기능(메서드)
	void power() {power = !power;}	//Tv를 켜거나 끄는 기능을 하는 메서드
	void channelUp() {++channel;}	//Tv의 채널을 높이는 기능을 하는 메서드
	void channelDown() {--channel;}//Tv의 채널을 낮추는 기능을 하는 메서
}

class TvTest {
	public static void main(String[] args) {
		//235p 예제6-1
//		Tv t;	//인스턴스를 참조하기 위한 변수
//		t = new Tv(); //Tv인스턴스를 생성
//		t.channel = 7; //Tv인스턴스의 멤버변수
//		t.channelDown(); //Tv인스턴스의 멤버변수 channel의 값을 7로 함
//		System.out.println("현재 채널은 "+t.channel+" 입니다.");
		
		//237p 예제6-2
//		Tv t1 = new Tv();
//		Tv t2 = new Tv();
//		System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
//		System.out.println("t1의 channel값은 "+ t2.channel + "입니다.");
//		
//		t1.channel = 7; //channel의 값을 7로 한다.
//		System.out.println("t1의 channel값을 7로 변경하였습니다.");
//		
//		System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
//		System.out.println("t2의 channel값은 "+ t2.channel + "입니다.");
		
		//238p 예제6-3
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel의 값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel의 값은 " + t2.channel + "입니다.");
		
		t2 = t1; //t1이 저장하고 있는 값(주소)을 t2에 저장
		t1.channel = 7; //channel의 값을 7로 함
		System.out.println("t1의 channel의 값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel의 값은 " + t2.channel + "입니다.");
		
	}
}