package obectOrientedProgramming1;

//예제6-27 303p
public class BlockTest {
	
	/* 클래스 초기화 블럭 */
	static {
		System.out.println("static {}");
	}
	
	/* 인스턴스 초기화 블럭 */
	{
		System.out.println("{ }");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();
		
	}

}
