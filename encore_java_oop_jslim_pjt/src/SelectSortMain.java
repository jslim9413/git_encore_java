
public class SelectSortMain {

	public static void main(String[] args) {
		
		// step01. 10개의 방을 가지는 배열 만들고 랜덤하게(1 ~ 100) 값으로 초기화 후 정렬전 출력   
		int [] ary = new int[10] ; 
		for(int idx = 0; idx < ary.length ; idx++) {
			ary[idx] = (int)( Math.random() * 100 ) + 1 ; 
		}
		aryPrt(ary);
		// step02. 초기화된 배열로부터 최소값이 들어 있는 인덱스 리턴받아 출력
		int minIdx = findMinIdx(ary) ;
		System.out.println();
		// System.out.println("최소값을 가지는 배열의 인덱스 : " + minIdx );
		// System.out.println("최소값                    : " + ary[minIdx] ); 
		for(int idx = 0; idx < ary.length ; idx++) {
			System.out.print( ary[idx] + "\t" ); 
		}
		System.out.println();
	}
	
	public static int findMinIdx(int [] ary) {
		/* case01. 
		int minIdx = 0 ;
		for(int idx = 1 ; idx < ary.length ; idx ++) {
			if(ary[minIdx] > ary[idx] ) {
				minIdx = idx ; 
			}
		}
		return minIdx ;
		*/
		
		// case02. 
		for(int i = 0 ; i < ary.length - 1 ; i++) {
			int minIdx = i ;
			for(int j = i+1 ; j < ary.length ; j++ ) {
				// 인덱스 변경
				if(ary[minIdx] > ary[j] ) {
					minIdx = j ; 
				}
			}
			int temp = ary[i];
			ary[i] = ary[minIdx] ; 
			ary[minIdx] = temp ; 
			
		}
		
		return 0 ;  
	}
	
	// 정렬 전 배열의 값을 출력.....
	public static void aryPrt(int [] ary) {
		System.out.println(">>>> 정렬 전 출력 ");
		for(int idx = 0; idx < ary.length ; idx++) {
			System.out.print( ary[idx] + "\t"); 
		}
	}

}
