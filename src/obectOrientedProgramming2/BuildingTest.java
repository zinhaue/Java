package obectOrientedProgramming2;

public class BuildingTest {

	public static void main(String[] args) {
	

	}

}

class Building{}

class Academy extends Building{}
 
class Bunker extends Building{}

class Barrack extends Building implements Liftable{
	LiftableImpl lift = new LiftableImpl();
	public void liftOff() {
		lift.liftOff();
	}
	public void move() {
		lift.move();
	}
	public void stop() {
		lift.stop();
	}
	public void land() {
		lift.land();
	}
}

class Factory extends Building implements Liftable{
	LiftableImpl lift = new LiftableImpl();
	public void liftOff() {
		lift.liftOff();
	}
	public void move() {
		lift.move();
	}
	public void stop() {
		lift.stop();
	}
	public void land() {
		lift.land();
	}
}

interface Liftable{
	void liftOff();
	void move();
	void stop();
	void land();
}

class LiftableImpl implements Liftable{

	@Override
	public void liftOff() {
		
	}

	@Override
	public void move() {
		
	}

	@Override
	public void stop() {
	}

	@Override
	public void land() {
	}
	
}