import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.encore.algorithm.Student;

/* 
입력예시) 
A 100
B 80
출력예시)
B
A
*/
public class SortQuestion02Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("배열의 길이를 입력하세요 : ");
		int length = scan.nextInt();
		
		List<Student> lst = new ArrayList<Student>();
		scan.nextLine();
		for(int i = 0 ; i < length ; i++) {
			String info = scan.nextLine() ;
			String [] ary = info.split(" ");
			lst.add(new Student(ary[0], Integer.parseInt(ary[1]) ) ); 
		}
		
		Collections.sort(lst); 
		for(Student obj : lst) {
			System.out.println( obj.getName() );
		}
		
		
	}

}



