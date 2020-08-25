package obectOrientedProgramming2;

//예제7-15 359p
public class CastingTest1 {

	public static void main(String[] args) {
		Car c = null;  
		FireEngine fe = new FireEngine();
		FireEngine fe2 = new FireEngine();
		
		c = fe; //업캐스팅(형변환생략가능)
		c.stop(); //FireEngine에 재정의(오버라이딩)안했기때문에 기존 내용으로 출력됨 
		c.drive();//FireEngine에 재정의(오버라이딩)했기 때문에 재정의된 내용으로 출력됨
		//c.water(); //Car클래스에 정의된 메서드가 아니기 때문에 호출 못함
		
		fe2 = (FireEngine)c; //다운캐스팅(형변환생략불가능)
		fe2.drive();
		

		Car c2 = new Car();
		FireEngine fe3 = new FireEngine();
		//fe3 = (FireEngine)c2; //실행시 에러 발생 : 자손타입의 참조변수가 조상타입의 객체 참조할 수 없음
		
		Car c3 = null;
		System.out.println(c instanceof Car); 
		System.out.println(c instanceof FireEngine); 
		System.out.println(c2 instanceof Car); 
		System.out.println(c2 instanceof FireEngine); 
		System.out.println(c3 instanceof Car); 
	
	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("Car, drive!!!");
	}
	
	void stop() {
		System.out.println("stop!!!!!");
	}
}

class FireEngine extends Car{
	void drive() {
		System.out.println("FireEngine, drive!!!");
	}
	void water() {
		System.out.println("water!!!!!!");
	}
}