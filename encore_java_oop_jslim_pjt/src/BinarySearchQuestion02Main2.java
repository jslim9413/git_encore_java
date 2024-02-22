/*
입력예시) 떡의 개수(N)와 요청한 떡의 길이(M)  
4 6

19 14 10 17 (떡의 개별 높이)

4   0  0  2

출력조건)
절단기의 길이는 가장 긴 떡의 길이
적어도 M만큼의 떡을 집에 가져가기 위해 절단기를 설정할 수 있는 높이의 최대값 출력
출력예시)
15
*/
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchQuestion02Main2 {
	public static void main(String[] args) {
		System.out.print("떡의 개수(N)와 요청한 떡의 길이(M) 입력 : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt() ;
		int m = scan.nextInt() ;
		Integer [] cakesAry = new Integer[n] ;
		for(int i = 0 ; i < cakesAry.length ; i++) {
			cakesAry[i] = scan.nextInt() ;
		}
		int result = search(cakesAry, m);
		if(result == -1) {
			System.out.println("절단 실패");
		}else {
			System.out.println("절단기 설정 최대 값 : " + result ); 
		}
	}
	public static int search(Integer [] ary , int target) {
		int result = -1 ;
		
		return result;  
	}

}








