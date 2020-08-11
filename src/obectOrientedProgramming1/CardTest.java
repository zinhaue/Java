package obectOrientedProgramming1;

class Card {
	int num;		//각각 카드의 숫자(인스턴스변수)
	String shape;	//각각 카드의 문양(인스턴스변수)
	String color;	//각각 카드의 색(인스턴스변수)
	
	static int width;	//공통된 카드의 가로(클래스변수)
	static int height;	//공통된 카드의 세로(클래스변수)
}

class CardTest {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		c1.num = 1;
		c2.num = 2;
		
		c1.shape = "heart";
		c2.shape = "clovar";
		
		c1.color = "red";
		c2.color = "black";
		
		Card.width = 10;
		Card.height = 20;
		
		System.out.println("c1 num:"+c1.num+" c1 shape:"+c1.shape+" c1 color:"+ c1.color + "c1 width:"+c1.width+ " c1 height:" +  c1.height);
		System.out.println("c2 num:"+c2.num+" c2 shape:"+c2.shape+" c2 color:"+ c2.color + "c2 width:"+c2.width+ " c2 height:" +  c2.height);		
	}
}
