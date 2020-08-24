package obectOrientedProgramming2;

//예제7-7 332p
public class PointTest {

	public static void main(String[] args) {

	}

}

class Point1 {
	int x,y;

	
	Point1(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation(){
		return "x :" + x + ", y :" + y ;
	}
}

class Point3D extends Point1{
	int z;
	
	Point3D(int x, int y, int z) {
		super(x,y); //조상클래스의 생성자를 호출(Point1(int x, int y)
		//this.x = x;
		//this.y = y;
		this.z = z;
	}
	
	String getLocation() { //오버라이딩
		return "x :" + x + ", y :" + y +", z :" +z;
	}
}