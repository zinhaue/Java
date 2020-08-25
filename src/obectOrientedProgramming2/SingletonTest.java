package obectOrientedProgramming2;

//예제7-14 352p
final class Singleton{
	private static Singleton s = new Singleton();
	private Singleton() {
		//...
	}
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
}

public class SingletonTest {

	public static void main(String[] args) {
		//Singleton s = new Singleton();//error : Singleton생성자는 private 접근제어자를 사용하므로 직접 생서불가능
		Singleton s = Singleton.getInstance();

	}

}
