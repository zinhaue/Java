package obectOrientedProgramming2;

//예제7-30 402p
public class DefaultMethodTest {

	public static void main(String[] args) {
		DefaultChild c = new DefaultChild();
		c.method1();
		c.method2();
		MyInterface.staticmethod();
		MyInterface2.staticmethod();

	}

}

class DefaultChild extends DefaultParent implements MyInterface, MyInterface2{
	public void method1() {
		System.out.println("method1() in Child"); //오버라이딩
	}
}

class DefaultParent{
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

interface MyInterface{
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	static void staticmethod() {
		System.out.println("staticmethod() in MyInterface");
	}
}

interface MyInterface2{
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	static void staticmethod() {
		System.out.println("staticmethod() in MyInterface2");
	}
}