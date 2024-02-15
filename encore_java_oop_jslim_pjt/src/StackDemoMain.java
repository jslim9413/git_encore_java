import java.util.Stack;

import com.encore.data.structor.stack.EncoreStack;

public class StackDemoMain {

	public static void main(String[] args) {
		
		/* case01. 
		Stack<Integer> stack = new Stack<Integer>() ; 
		stack.push(10); stack.push(20); stack.push(30); stack.add(40) ; 
		System.out.println(stack); 
		System.out.println( stack.pop() ); 
		System.out.println(stack);
		System.out.println( stack.pop() );
		System.out.println(stack);
		System.out.println( stack.pop() );
		System.out.println(stack);
		System.out.println( stack.pop() );
		System.out.println(stack);
		System.out.println( stack.pop() );
		*/
		
		/* case02. 
		Stack<String> stack = new Stack<>();
		System.out.println("empty : " + stack.empty() ); 
		System.out.println("empty : " + stack.isEmpty() );
		System.out.println("스택에 데이터가 없을 때 입력하고싶다면? "); 
		if( stack.isEmpty() ) {
			stack.push("One"); stack.push("Two"); stack.push("Three"); 
		}
		System.out.println( stack ); 
		stack.add(0, "Four") ; 
		System.out.println( stack );
		String str = stack.pop();
		System.out.println("pop : " + str ); 
		System.out.println( str.equals("Four") ); 
		System.out.println("size : " + stack.size() ); 
		System.out.println( stack );
		System.out.println("search : " + stack.search("One") ); 
		System.out.println("search : " + stack.search("Four") );
		*/
		
		EncoreStack stack = new EncoreStack() ; 
		// stack.push(10); 
		// System.out.println( stack.pop() ) ; 
		
		stack.push(10); stack.push(9); stack.push(8); stack.push(7);
		if( stack.isEmpty() ) {
			System.out.println("스택이 비어있습니다.");
		} else {
			System.out.println( stack.pop() ) ;
		}
		stack.prtStack() ; 
		System.out.println("peek  : " + stack.peek()); 
		stack.prtStack() ;
		
		System.out.println("main end"); 
		
	}

}






