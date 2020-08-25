package obectOrientedProgramming2;

//예제7-13 350p
public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(12, 35, 30);
		System.out.println(t);
		//t.hour = 13; //error : hour는 private 접근제어자를 사용하므로 외부에서 접근 불가능
		t.setHour(t.getHour()+1); //현재시간보다 1시간 후로 변경
		System.out.println(t);
	}

}

class Time{
	private int hour, minute, seconds;
	Time(int hour, int minute, int seconds){
		setHour(hour);
		setMinute(minute);
		setSeconds(seconds);
	}
	public int getHour(){return hour;}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) return;
		this.minute = minute;
	}
	public void setSeconds(int seconds) {
		if(seconds < 0 || seconds > 59) return;
		this.seconds = seconds;
	}
	public String toString() {
		return hour + ":" + minute + ":" +seconds;
	}
}