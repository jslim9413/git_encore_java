
public class QuickMain {

	public static void main(String[] args) {
		
		int [] ary = new int[10] ;
		for(int i = 0 ; i < ary.length ; i++) {
			ary[i] = (int)( Math.random() * 100 ) + 1 ; 
			for(int j = 0 ; j < i ; j++) {
				if( ary[j] == ary[i]) {
					i--  ;
					break ;
				}
			}
		}
		quickPrt(ary);
		System.out.println();
		quickSort(ary, 0, ary.length - 1);
		quickPrt(ary);
		// System.out.println();
	}
	
	public static void quickSort(int [] ary , int start , int end) {
		if( start >= end ) {
			return  ;
		}
		
		// int pivot = ary.length / 2 ;
		// int pivot = ary[(low + high)/2] ;
		// System.out.println("pivot data : " + pivot);
		/*
		int pivot = low ; 
		int left  = low +1 ;
		int right = high ; 
		
		while(left <= right) {
			// 피봇보다 큰 데이터를 찾을 때 까지 반복 
			while( left <= high && ary[left] <= ary[pivot] ) {
				left++ ;
			}
			// 피봇보다 작은 데이터를 찾을 때 까지 반복
			while( right > low && ary[right] >= ary[pivot] ) {
				right-- ;
			}
			
			int temp = ary[right] ;
			
			if(left > right) {
				ary[right] = ary[pivot] ; 
				ary[pivot] = temp ; 
			}else {
				ary[right] = ary[left] ; 
				ary[left] = temp ;
			}
		}
		quickSort(ary , low , right - 1) ; 
		quickSort(ary , right+1 , high) ;
		*/
		
		int low  = start ; 
		int high = end ; 
		int pivot = ary[ (low+high)/2 ] ;
		System.out.println("pivot value : " + pivot ); 
		
		while(low <= high) {
			while( ary[low] < pivot) {
				low++ ;
			}
			while( ary[high] > pivot) {
				high-- ;
			}
			if(low <= high) {
				int temp  = 0 ; 
				temp      = ary[low] ; 
				ary[low]  = ary[high] ; 
				ary[high] = temp ;
				low++  ; 
				high-- ; 
			}
		} // while end 
		int mid = low ; 
		System.out.println("while mid = " + mid ); 
		// left sort
		quickSort(ary , start , mid-1);
		// right sort
		quickSort(ary , mid , end); 
	}
	
	public static void quickPrt(int [] ary) {
		for(int idx = 0 ; idx < ary.length ; idx++) {
			System.out.print(ary[idx] + "\t" );
		}
	}

}
