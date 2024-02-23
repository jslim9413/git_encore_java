/*
입력예시) 
5 : 공간( 5 * 5) 개념으로 생각
R R R U D   
출력예시)
좌표값 출력(x , y)
switch ~ case 
*/
import java.util.Scanner;

public class ImplementAlgorithmMain {

	public static void main(String[] args) {
		System.out.print("공간을 입력하세요 :  "); 
		Scanner scan = new Scanner(System.in) ; 
		int n = scan.nextInt() ;
		scan.nextLine() ;
		String path = scan.nextLine().replaceAll(" ", "");
		System.out.println("path : " + path ); 
		int x = 1 ; //(R, L) 
		int y = 1 ; //(U, D) 
		for(char route : path.toCharArray() ) {
			switch(route) {
				case 'R' :
					x = (x + 1) > n ? x : (x + 1) ; 
					break;
				case 'L' :
					x = (x - 1) < 1 ? x : (x - 1) ;
					break;
				case 'U' :
					
					break;
				case 'D' :
					
					break;
			}
		}
		System.out.println("move point : (" + x + " , " + y + ")");
	}
}










