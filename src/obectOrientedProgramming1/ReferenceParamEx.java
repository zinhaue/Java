package obectOrientedProgramming1;

class Date2 { int x;}

public class ReferenceParamEx {

	public static void main(String[] args) {
		Date2 d = new Date2();
		d.x = 10;
		System.out.println("main() : d.x = " +d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);

	}
	
	static void change(Date2 d) {
		d.x = 1000;
		System.out.println("change() : d.x = "+ d.x);
	}

}
