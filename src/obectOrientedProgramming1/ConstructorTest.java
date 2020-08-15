package obectOrientedProgramming1;

//예제6-23 293p
class Data1{
	int value;
}

class Data2{
	int value;
	
	//매개변수가 있는 생성자
	Data2(int x){	
		value = x;
	}
}

class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		//Data2 d2 = new Data2();	//compile erorr발생

	}

}
