package obectOrientedProgramming2;

//예제7-29 399p
public class InterfaceTest3 {

	public static void main(String[] args) {
		AAA a = new AAA();
		a.methodA();
	}

}

class AAA{
	void methodA() {
		//제3의 클래스의 메서드를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 얻어옴.
		Interface i = InstanceManager.getInstance(); 
		i.methodB();
		System.out.println(i.toString());
	}
}

interface Interface{
	public abstract void methodB();
}

class BBB implements Interface{
	@Override
	public void methodB() {
		System.out.println("methodB in B class");
	}
	public String toString() { return "class B";}
}

class InstanceManager {
	public static Interface getInstance() {
		return new BBB();
	}
}