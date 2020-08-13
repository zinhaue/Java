package obectOrientedProgramming1;

class Data {int x;}

//예제6-15 268p
public class ReferenceReturnEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() x : " + d.x);
		
		Data d2 = copy(d);
		System.out.println("After copy(d)");
		System.out.println("main() x : " + d2.x);
	}
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		return tmp;
	}

}
