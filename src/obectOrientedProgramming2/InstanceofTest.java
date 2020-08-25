package obectOrientedProgramming2;

//예제7-17 364p
public class InstanceofTest {

	public static void main(String[] args) {
		
		//Car1 c = null;
		//System.out.println(c instanceof Car1); //false(참조하는 값이 null)

		//Car1 c1 = new FireEngine1();
		//System.out.println(c1 instanceof FireEngine1); //true
		//System.out.println(c1 instanceof Car1); //true
		
		FireEngine1 fe = new FireEngine1();
		if(fe instanceof FireEngine1) {
			System.out.println("This is a FireEngine1 instance");
		}
		if(fe instanceof Car1) {
			System.out.println("This is a Car1 instance");
		}

		System.out.println(fe.getClass().getName()); //클래스이름출력
	}

}

class Car1{}
class FireEngine1 extends Car1{}