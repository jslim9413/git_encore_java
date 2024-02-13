import com.encore.thread.ShareObj;

public class ThreadDemoMain {

	public static void main(String[] args) {
		System.out.println("main thread start !!");
		
		ShareObj obj = new ShareObj();
		Thread   thread01 = new Thread(obj); 
		thread01.start(); 
		
		ShareObj obj02 = new ShareObj();
		Thread   thread02 = new Thread(obj02); 
		thread02.start(); 
				
		// obj.running();
		// obj.running();
		
		System.out.println("main thread end !!");

	}

}


