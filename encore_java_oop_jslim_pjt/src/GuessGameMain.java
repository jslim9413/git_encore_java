import java.util.Random;

import com.encore.guessgame.GuessGame;

public class GuessGameMain {

	public static void main(String[] args) {
		Random random = new Random();
		int hiddeenNumber = random.nextInt(100) + 1 ;
		System.out.println("answer >> "+hiddeenNumber);
		/////////
		boolean isFlag = false ; // 10번을 채우지 않고 종료될 경우 
		int cnt = 0 ;            // 횟수를 저장하기 위해서 
		/////////
		System.out.println("***********************************");
		System.out.println("1에서 100사이의 숫자를 맞춰보세요.");
		System.out.println("10번의 기회가 있습니다.");
		System.out.println("***********************************");
		
		while( !isFlag && cnt++ < 10 ) {
			System.out.print(cnt+"번째 기회입니다. 숫자를 입력하세요 : ");
			int inputNumber = GuessGame.getUserInput() ;
			
			if(inputNumber > 100 || inputNumber < 1) {
				System.out.println("1 ~ 100 사이값을 입력하세요"); 
			} else {
				if( hiddeenNumber > inputNumber ) {
					System.out.println( inputNumber+ "보다 큽니다.");
				} else if ( hiddeenNumber < inputNumber ) {
					System.out.println( inputNumber+ "보다 작습니다.");
				} else {
					isFlag = true ;
				}
			}
		}
		if( isFlag ) {
			System.out.println("축하합니다. " + cnt + "번 만에 맞추셨네요." );
		}else {
			System.out.println("10번의 기회가 끝났습니다. 다시 한 번 시도해 보세요");
		}
		
	}
	
}









