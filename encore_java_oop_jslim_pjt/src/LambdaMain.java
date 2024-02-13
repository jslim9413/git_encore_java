import com.encore.lambda.ILambda;
import com.encore.lambda.LambdaImpl;
import com.encore.lambda.Operation;

public class LambdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ILambda lambda = new ILambda() {
			@Override
			public void printInfo(String str) {
				System.out.println(str);
			}

			@Override
			public int add(int x, int y) {
				return x + y ;
			}
		} ;
		lambda.printInfo("hello~~~");
		System.out.println("add = " + lambda.add(10, 10) ); 
		*/
		
		/*
		ILambda lambda = (int x, int y) -> { 
			return x + y ; 
		} ; 
		System.out.println("add = " + lambda.add(10, 10) );
		*/
		
		/*
		ILambda lambda = new LambdaImpl();
		lambda.printInfo("기존 코드 방식");
		System.out.println("add = " + lambda.add(10, 10) ); 
		*/
		
		/*
		int addSum = result( (x, y) -> x+y ); 
		System.out.println("add = " + addSum );
		*/
		/*
		Thread thread = new Thread( new Runnable() {
			@Override
			public void run() {
				for(int i=0 ; i < 10 ; i++) {
					System.out.println(i);
				}
			}
		});
		thread.start();
		*/
		/*
		Thread thread = new Thread(
				() -> {
					for(int i=0 ; i < 10 ; i++) {
						System.out.println(i);
					}
				}
		);
		thread.start(); 
		*/
		System.out.println(Operation.DIVIDE.apply(2,3)); 
	}
	
	public static int result(ILambda lambda ) {
		return lambda.add(10, 10) ; 
	}
	
}










