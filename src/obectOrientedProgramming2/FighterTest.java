package obectOrientedProgramming2;

//예제7-24 383p
public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {
			System.out.println("f는 Unit클래스의 자손입니다.");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable클래스의 자손입니다.");
		}
		if(f instanceof Movable) {
			System.out.println("f는 Movable클래스의 자손입니다.");
		}
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable클래스의 자손입니다.");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object클래스의 자손입니다.");
		}

	}

}

class Fighter extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {
		/* 내용생략 */
	}

	@Override
	public void attack(Unit u) {
		/* 내용생략 */
	}
	
}

class Unit{
	int currentHP;	//유닛의 체력
	int x;			//유닛의 위치(x좌표)
	int y;			//유닛의 위치(y좌표)
}

interface Fightable extends Movable, Attackable{}

interface Movable{
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit u);
}