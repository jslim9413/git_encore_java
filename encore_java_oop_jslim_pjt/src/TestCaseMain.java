import java.util.PriorityQueue;

public class TestCaseMain {
	public static int n = 3 ;
	public static void main(String[] args) {
		// openBox();
		int sum = 1 ; 
		for(int idx = 10 ; idx > 0 ; idx--) {
			sum *= idx ; 
		}
		System.out.println(sum);
		// System.out.println(addNumber(10));
	}
	
	public static void openBox() {
		System.out.println("종이 상자를 엽니다. ");
		n = n - 1 ;
		
		if(n == 0) {
			System.out.println("반지를 넣고 반환합니다.");
			return;
		}
		
		openBox();
		System.out.println("종이 상자를 닫습니다. ");
	}
	
	public static int addNumber(int num) {
		if (num <= 1) { 
			return 1 ;
		}
		return num + addNumber(num-1);
	}

}



