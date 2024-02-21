import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
01. Scanner 이용해서 배열의 크기를 입력 : 4
int [] ary = new int[4] ;
02. 배열의 크기만큼 반복구문을 이용해서 데이터입력(Scanner) : 24, 1, 12, 25
03. hint) 로직구현, reverOrder();
answer : 25, 24, 12, 1
*/
public class SortQuestion01Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("배열의 길이를 입력하세요 : ");
		int n = scan.nextInt();
		
		Integer numbers[] = new Integer[n];
		
		for(int i = 0; i < numbers.length ; i++){
			System.out.print("입력가능 범위는 1 <= N <= 500 : ");
		    numbers[i] = scan.nextInt();
		}
		// Arrays.sort(numbers, Comparator.reverseOrder());
		// 이중 루프 구문으로 내림차순 정렬 - 스왑도 생각 
		// sort
		for(int i= 0 ; i < numbers.length -1 ; i++) {
			for(int j = i+1 ; j < numbers.length ; j++) {
				if( numbers[i] < numbers[j] ) {
					int temp = numbers[i] ; 
					numbers[i] = numbers[j] ;
					numbers[j] = temp ;
				}
			}
		}
		for(int i = 0; i < numbers.length ; i++){
			 System.out.print(numbers[i] + "\t");
		}
		
	}

}
