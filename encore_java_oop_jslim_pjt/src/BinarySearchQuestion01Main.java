/*
입력예시) 배열의 길이와 부품번호 
부품을 관리하는 배열
N = 5
8 3 7 9 2

사용자 요청
M = 3
5 7 9 

출력예시)
부품이 존재하면 yes 부품이 존재하지 않으면 no 
no 	yes	yes
*/

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchQuestion01Main {

	public static void main(String[] args) {
		System.out.print("부품관리 배열 길이 입력 : ");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt() ;
		scan.nextLine();
		String  [] tempAry  = scan.nextLine().split(" ");
		Integer [] partsAry = new Integer[len] ; 
		for(int i = 0 ; i < tempAry.length ; i++) {
			partsAry[i] = Integer.parseInt(tempAry[i]);
		}
		System.out.println("N : " + len);
		System.out.print("parts : ") ; 
		for(int i = 0 ; i < partsAry.length ; i++) {
			System.out.print(partsAry[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(partsAry); 
		aryPrt(partsAry);
		///////////////////////////////// 사용자의 요청에 따른 입력 
		int M = scan.nextInt() ; 
		Integer [] targetAry = new Integer[M]; 
		for(int i = 0 ; i < targetAry.length ; i++) {
			targetAry[i] = scan.nextInt() ; 
		}
		
		for(int target : targetAry) {
			System.out.print( search(partsAry , target) + "\t" );
		}
	}
	
	public static String search(Integer [] ary , int target) {
		int low    = 0 ; 
		int high   = ary.length -1 ; 
		int mid    = 0 ; 
		int result = -1 ;  
		while(low <= high) {
			mid =  low + ((high - low) / 2) ; 
			if(target == ary[mid]) {
				result =  mid ;
				break;
			} else if( target < ary[mid] ) {
				high = mid - 1 ; 
			} else {
				low = mid + 1 ;
			}
		}
		return (result != -1) ? "yes" : "no " ;  
	}
	
	public static void aryPrt(Integer [] ary) {
		System.out.println("정렬 데이터 >>>> ");
		for(Integer data : ary) {
			System.out.print(data + "\t");
		}
		System.out.println();
	}

}



