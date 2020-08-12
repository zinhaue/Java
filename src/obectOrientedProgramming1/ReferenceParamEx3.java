package obectOrientedProgramming1;

//예제6-12 267p
public class ReferenceParamEx3 {

	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,6,5,4};
		
		printArr(arr);	//배열의 모든 요소를 출력
		sortArr(arr);	//배열을 정렬
		printArr(arr);	//정렬 후 배열의 모든 요소 출력
		System.out.println("sum = "+sumArr(arr));
	}
	static void printArr(int[] arr) {
		for(int a : arr) {
			System.out.print(a +" ");
		}
		System.out.println();
		System.out.println("----------------------");
	}
	static void sortArr(int[] arr) {
		for(int i=0; i< arr.length-1; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int tmp = 0;
					tmp = arr[j];
					arr[j]=arr[i];
					arr[i] = tmp;
				}
			}
		}	
	}
	
	static int sumArr(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
