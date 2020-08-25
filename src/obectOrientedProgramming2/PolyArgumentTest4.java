package obectOrientedProgramming2;

import java.util.Vector;

//예제7-21 368p
class Product4{
	int price; //제품의 가격
	int bonusPoint; //제품구매시 제공되는 보너스점수
	Product4(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);//보너스 점수는 제품가격의 10%
	}
	Product4(){
		price = 0;
		bonusPoint = 0;
	}
}

class TV4 extends Product4{
	TV4(){
		//조상클래스의 생성자 Product(int price)를 호출
		super(100);
	}
	//Obect클래스의 toString()을 오버라이딩
	public String toString() {return "TV";}
}

class Computer4 extends Product4{
	Computer4(){
		super(200);
	}
	public String toString() {return "Computer";}
}

class Audio4 extends Product4{
	Audio4(){
		super(50);
	}
	public String toString() { return "Audio";}
}

class  Buyer4{			//고객, 물건을 사는 사람
	int money = 1000; 	//소유금액
	int bonusPoint = 0; //보너스점수
	Vector item = new Vector(); //구입한 제품을 저장하는데 사용될 객체
	
	void buy(Product4 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "을/를 구입하셨습니다!!");
	
	}
	void refund(Product4 p) {
		System.out.println(item.remove(p));
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	void summary() {
		int sum=0;
		String itemList ="";
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		for(int i=0; i<item.size(); i++) {
			Product4 p = (Product4)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p:", " + p;
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 물품은 " + itemList + "입니다.");
		
	}
}
public class PolyArgumentTest4 {

	public static void main(String[] args) {
		Buyer4 b = new Buyer4();
		
		b.buy((new TV4()));
		b.buy(new Computer4());
		b.buy(new Audio4());
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
		b.summary();
		b.refund((new Computer4()));
		b.summary();
	}

}

