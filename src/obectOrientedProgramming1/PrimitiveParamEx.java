package obectOrientedProgramming1;

class Date {int x;}

public class PrimitiveParamEx {

	public static void main(String[] args) {
		Date d = new Date();
		d.x = 10; 
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);

	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}
