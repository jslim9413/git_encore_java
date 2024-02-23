import java.util.Scanner;

public class FiboMain {
	
	// DP topDown - bottomUp 
	public static long [] topDownAry ;    // 메모이제이션
	public static long [] bottomUpAry ;   // 메모이제이션
	
	// 피보나치 수열에도 메모이제이션 적용
	public static void main(String[] args) {
		System.out.print("데이터 입력(30) :  "); 
		Scanner scan = new Scanner(System.in) ; 
		int num = scan.nextInt() ; 
		
		topDownAry  = new long[ num + 1 ] ;
		bottomUpAry = new long[ num + 1 ] ;
		
		long startTime = System.currentTimeMillis() ; 
		System.out.println( "result = " + fibonacci(num) );
		long endTime = System.currentTimeMillis() ;
		System.out.println("소요시간 : " + (endTime - startTime) ) ; 
		
		System.out.println();
		startTime = System.currentTimeMillis() ; 
		System.out.println( "result = " + topDown(num) );
		endTime = System.currentTimeMillis() ;
		System.out.println("소요시간 : " + (endTime - startTime) ) ; 
		
		
		System.out.println();
		startTime = System.currentTimeMillis() ; 
		System.out.println( "result = " + bottomUp(num) );
		endTime = System.currentTimeMillis() ;
		System.out.println("소요시간 : " + (endTime - startTime) ) ;
		
		
	}
	public static long fibonacci(int num) {
		if(num <= 1) {
			return num ; 
		}
		return  fibonacci(num-1) + fibonacci(num-2); 
	}
	// DP - topDown
	public static long topDown(int num) {
		if( num < 2) {
			return topDownAry[num] = num ; 
		}
		// 메모이제이션에 계산된 결과가 있으면 바로 리턴 
		if( topDownAry[num] > 0 ) {
			return topDownAry[num] ;
		}
		topDownAry[num] = fibonacci(num-1) + fibonacci(num-2); 
		return topDownAry[num] ;   
	}
	// DP - bottomUp
	public static long bottomUp(int num) {
		bottomUpAry[0] = 0 ; 
		bottomUpAry[1] = 1 ;
		
		for(int i = 2 ; i <= num ; i++) {
			bottomUpAry[i] = bottomUpAry[i - 1] + bottomUpAry[i - 2];
		}
		
		return bottomUpAry[num]  ; 
	}
	
}












