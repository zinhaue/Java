package obectOrientedProgramming1;

public class TvTest4 {

	public static void main(String[] args) {
//		Tv[] tvArr = new Tv[3];
//		for(Tv a : tvArr) {
//			System.out.println(a);
//		}
		
//		//객체를 생성해서 객체 배열의 각 요소에 저장하는 방법1
//		Tv[] tvArr1 = new Tv[3];
//		tvArr1[0] = new Tv();
//		tvArr1[1] = new Tv();
//		tvArr1[2] = new Tv();
//
//		//객체를 생성해서 객체 배열의 각 요소에 저장하는 방법2
//		Tv[] tvArr2 = new Tv[3];
//		for(Tv a : tvArr2) {
//			a = new Tv();
//		}	
//		
//		//객체를 생성해서 객체 배열의 각 요소에 저장하는 방법3
//		Tv[] tvArr3 = {new Tv(), new Tv(), new Tv()};
		
		//242p 예제6-4
		Tv[] tvArr = new Tv[3]; //길이가 3인 Tv객체 배열
		
		//Tv객체를 생성해서 Tv객체배열의 각 요소에 저장
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10; //tvArr[i]의 channel에 i+10을 저장
		}
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.println(tvArr[i].channel);
		}
	}

}
