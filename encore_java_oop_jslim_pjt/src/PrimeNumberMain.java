import com.encore.primenumber.ExercisePrimeNumber;

public class PrimeNumberMain {

	public static void main(String[] args) {
		
		int inputNumber = ExercisePrimeNumber.getUserInput() ; 
		
		// 소수란? 1과 자기 자신으로만 나누어지는 수 
		// 소수 판단하는 로직(for, if) 
		// 0, 1 은 소수가 아니다. 2 소수
		// 어떤 숫자가 소수가 될려면 11을 2부터 10(11보다 1작은 숫자)까지 차례대로 나누어보고
		// 나머지가 0인 경우가 한번도 없으면 그 수는 소수이다.
		// 즉, N 보다 작은 자연수들로 나누는 방식
		
		if(inputNumber < 2 ) {
			System.out.println(inputNumber+"은(는) 소수가 아닙니다.");
		} else if(inputNumber == 2) {
			System.out.println(inputNumber+"은(는) 소수입니다.");
			return  ;
		}
		boolean isFlag = true ; 
		for(int idx = 2 ; idx < inputNumber ; idx++  ) {
			if( inputNumber % 2 == 0 ) { // 만족하면 소수가 아니므로 
				isFlag = false ; 
				break ;
			} 
		}
		String msg = (isFlag == true) ?  inputNumber+"은(는) 소수입니다." : inputNumber+"은(는) 소수가 아닙니다." ; 
		System.out.println(msg); 
		
		
				
	}
}

