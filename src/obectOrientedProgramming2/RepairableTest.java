package obectOrientedProgramming2;

//예제7-26 392p
public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv= new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
		//scv.repair(marine);
	}

}

interface Repairable{}

class Units {
	int hitPoint;
	final int MAX_HP;
	Units(int hp){
		MAX_HP = hp;
	}
	//...
}

class GroundUnits extends Units{
	GroundUnits(int hp){
		super(hp);
	}
}

class AirUnits extends Units{
	AirUnits(int hp){
		super(hp);
	}
}

class Marine extends GroundUnits{
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnits{
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	void repair(Repairable r) {
		if(r instanceof Units) {
			Units u = (Units) r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + " 의 수리가 끝났습니다.");
		}
	}
}

class Tank extends GroundUnits implements Repairable{
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnits implements Repairable{
	Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Dropship";
	}
}