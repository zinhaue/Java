package obectOrientedProgramming2;

public class DrawShape {

	public static void main(String[] args) {
		
		Circle c = new Circle(); 
		c.draw(); //Circle(0,0)으로 초기화됨
		
		Circle c2 = new Circle(new Point(1,1),30); 
		c2.draw(); 
		
		//객체배열 초기화
		Point[] p = {
					new Point(0,0)
					,new Point(1,1)
					,new Point(2,2)
					};
		//Point[] p = new Point[3];
		//p[0] = new Point(0,0);
		//p[1] = new Point(1,1);
		//p[2] = new Point(2,2);
		Triangle t = new Triangle(p);
		t.draw();

	}

}

class Shape{
	String color = "black";
	void draw() {
		System.out.printf("[color=%s]%n",color);
	}
}
class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	Point(){
		this(0,0);
	}
	
	String getXY() {
		return "("+x+","+y+")";	
	}
}
class Circle extends Shape{
	Point center;
	int r;
	
	Circle(){
		this(new Point(0,0), 100);	//Circle(Point center, int r)을 호
	}
	
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	
	//Overriding
	void draw() {
		System.out.printf("[center=(%d, %d),%d,color=%s]%n",center.x, center.y, r, color); 
	}
}

class Triangle extends Shape{
	//객체배열
	Point[] p = new Point[3];
	
	Triangle(Point[] p) {
		this.p = p;
	}
	
	//Overriding
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY());
	}
}