import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/* 
입력예시) 
5 3 -> 두 배열의 길이와 바꿔칠 수 있는 횟수
1 2 5 4 3 -> 첫번째 배열의 값
5 5 6 6 5 -> 두번째 배열의 값 

출력예시)
26

hint) 
정렬이 필요하고 각 인데스 번지에 값을 비교 바꿔치기 하는 것
첫번째 배열(오름), 두번째 배열(내림) 
12345
66555

66545 = 26
*/
public class SortQuestion03Main {
	public static void main(String[] args) {
		System.out.print("두 배열의 길이와 바꿔칠 수 있는 횟수 : ");
		Scanner scan = new Scanner(System.in);

	    String [] inputAry = scan.nextLine().split(" ");
	    int n = Integer.parseInt(inputAry[0]);
	    int k = Integer.parseInt(inputAry[1]);
	    System.out.println(n +" "+k);
	    /*
	    System.out.print(n + "개의 데이터를 입력하세요 : ");
	    String [] strAry01 = scan.nextLine().split(" ");
	    System.out.println();
	    String [] strAry02 = scan.nextLine().split(" ");
	    */
	    Integer [] ary01 = new Integer[n];
	    for(int i = 0 ; i < ary01.length ; i++) {
	    	ary01[i] = scan.nextInt() ; 
	    }
	    Integer [] ary02 = new Integer[n];
	    for(int i = 0 ; i < ary01.length ; i++) {
	    	ary02[i] = scan.nextInt() ; 
	    }
	    
	    Arrays.sort(ary01); 
	    Arrays.sort(ary02, Comparator.reverseOrder()) ; 
	    
	    for(int i = 0 ; i < k ; i++) {
	    	if(ary01[i] > ary02[i]) {
	    		break;
	    	}
	    	int temp = ary01[i];
	    	ary01[i] = ary02[i];
	    	ary02[i] = temp ; 
	    }
	    int sum = 0 ; 
	    for(int data : ary01) {
	    	sum += data ; 
	    }
	    System.out.println("sum = " + sum );
	    
	}

}






