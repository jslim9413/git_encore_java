import java.util.Scanner;

public class DpAlgorithmMain {

	public static void main(String[] args) {
		System.out.print("1 <= X <= 30000  :  "); 
		Scanner scan = new Scanner(System.in) ; 
		int num = scan.nextInt() ; 
		
		// bottomUp : 배열의 인덱스를 값을 생각하고 해당인덱스번지에 연산횟수를 넣는 과정을 구현 
		// Math.min(x, y) ; 
		int [] bottomUpAry = new int[ num+1 ] ;
		bottomUpAry[1] = 0 ; 
		bottomUpAry[2] = 1 ;
		int [] divisorAry = {2, 3, 5} ; 
		
		for(int i = 3 ; i <= num ; i++) {
			bottomUpAry[i] = bottomUpAry[i-1] + 1 ; 
			for(int divisor : divisorAry) {
				if(i % divisor == 0 ) {
					bottomUpAry[i] = Math.min(bottomUpAry[i] , bottomUpAry[i/divisor] + 1 );
				}
			}
		}
		for(int cnt : bottomUpAry) {
			System.out.print(cnt + "\t") ;
		}
		System.out.println();
		System.out.println("연산 횟수 : " + bottomUpAry[num] ) ; 
	}
}



