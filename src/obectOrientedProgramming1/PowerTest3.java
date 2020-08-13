package obectOrientedProgramming1;

public class PowerTest3 {

	public static void main(String[] args) {
		int x = 2;
		int n = 3;
		long result = 0;
		
		for(int i=1; i<=n; i++) {
			result += power(x,i);
			// 1. 0 += power(2,1)  
			//					power(2,1) : 2
			//    0 += 2
			// 2. 2 += power(2,2) 
			//                   power(2,2) : 2 * power(2,1)
			//					 power(2,1) : 2
			//					 			: 2 * 2
			// 	  2 += 4  : 6
			// 3. 4 += power(2,3)
			//					 power(2,3) : 2 * power(2,2)
			//					 power(2,2) : 2 * power(2,1)
			//			 		 power(2,1) : 2
		    //					 			: 2 * 2
			//								: 2 * 4
			//	  6  += 8  :14
			
		}
		System.out.println(result);
	}
	static long power(int x, int n) {
		if(n==1) return x;
		return x * power(x, n-1);
	}

}
