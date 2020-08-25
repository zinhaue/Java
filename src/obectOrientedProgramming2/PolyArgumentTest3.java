package obectOrientedProgramming2;

//예제7-21 368p
class Product3{
	int price; //제품의 가격
	int bonusPoint; //제품구매시 제공되는 보너스점수
	Product3(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);//보너스 점수는 제품가격의 10%
	}
}

class TV3 extends Product3{
	TV3(){
		//조상클래스의 생성자 Product(int price)를 호출
		super(100);
	}
	//Obect클래스의 toString()을 오버라이딩
	public String toString() {return "TV";}
}

class Computer3 extends Product3{
	Computer3(){
		super(200);
	}
	public String toString() {return "Computer";}
}

class  Buyer3{			//고객, 물건을 사는 사람
	int money = 1000; 	//소유금액
	int bonusPoint = 0; //보너스점수
	int i = 0;
	Product3[] product = new Product3[10];
	void buy(Product3 p) {
		if(money < p.price) {
			i = 0;
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다!!");
		
		product[i] = p;
		i++;
	}
	void summary() {
		String tmp = "";
		for(int j=0; j<product.length; j++) {
			if(product[j] == null) {
				break;
			}
			tmp += product[j] + " ";
		}
		System.out.println(tmp);
	}
}
public class PolyArgumentTest3 {

	public static void main(String[] args) {
		Buyer3 b = new Buyer3();
		
		b.buy((new TV3()));
		b.buy(new Computer3());
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
		b.summary();
	}

}

