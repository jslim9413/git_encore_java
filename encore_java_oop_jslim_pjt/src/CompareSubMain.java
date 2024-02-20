
/*

정렬 : 모든 프로그램은 오름차순을 기본을 정렬한다.
JAVA 기준을 정의하지 않으면 오름차순 
기본타입과, 배열이 기본 타입을 요소로 가지고 있다면

Arrays.sort() , Collections.sort();   

[정렬의 일반화된 규칙]
- 비교 결과 리턴될 때
- 음수 : 두 원소의 위치를 교환 안함. {1 , 3} , {3 , 1} 
- 양수 : 두 원소의 위치를 교환

*/

import java.util.Arrays;
import java.util.Collections;

import com.encore.compare.EncoreInteger;

public class CompareSubMain {

	public static void main(String[] args) {
		
		EncoreInteger [] ary = new EncoreInteger[10] ; 
		
		// 랜덤하게 배열 초기화(1 ~ 100) : Random - nextInt() , Math - random() 
		for(int idx = 0 ; idx < ary.length ; idx++) {
			// System.out.print((int)(Math.random() * 100)+1 + "\t");
			ary[idx] =  new EncoreInteger( (int)(Math.random() * 100)+1 ) ;  
		}
		
		System.out.println("정렬 전 >>>>> ");
		for(int idx = 0 ; idx < ary.length ; idx++) {
			System.out.print(ary[idx].getData() + "\t");   
		}
		System.out.println();
		System.out.println("기본 오름차순 정렬 >>>>> "); 
		
		// sort() 는 배열 자체를 정려하므로 반환 값이 없다.
		// 오름차순 정렬
		Arrays.sort(ary);
		// 내림차순 정렬
		// Arrays.sort(ary , Collections.reverseOrder() ); 
		for(int idx = 0 ; idx < ary.length ; idx++) {
			System.out.print(ary[idx].getData() + "\t");   
		}
		
	}

}










