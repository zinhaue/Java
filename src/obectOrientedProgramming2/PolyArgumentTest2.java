package obectOrientedProgramming2;

//예제7-21 368p
class Product2{
	int price; //제품의 가격
	int bonusPoint; //제품구매시 제공되는 보너스점수
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);//보너스 점수는 제품가격의 10%
	}
}

class TV2 extends Product2{
	TV2(){
		//조상클래스의 생성자 Product(int price)를 호출
		super(100);
	}
	//Obect클래스의 toString()을 오버라이딩
	public String toString() {return "TV";}
}

class Computer2 extends Product2{
	Computer2(){
		super(200);
	}
	public String toString() {return "Computer";}
}

class  Buyer2{			//고객, 물건을 사는 사람
	int money = 1000; 	//소유금액
	int bonusPoint = 0; //보너스점수
	int totNum = 0;
	Product2[] product = new Product2[10];
	void buy(Product2 p) {
		if(money < p.price) {
			totNum = 0;
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다!!");
		
		product[totNum] = p;
		System.out.println(product[totNum]);
		totNum++;
	}
}
public class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy((new TV2()));
		b.buy(new Computer2());
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}

}

