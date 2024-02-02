import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;

public class OopMain {

	public static void main(String[] args) {
		
		StudentDTO stu01 = new StudentDTO() ; 
		
		/* 접근지정자가 private 일 경우 접근을 허용하지 않는다.
		System.out.println("인스턴스 소유의 변수에 접근하여 값을 가져온다 -> " + stu01.name);
		System.out.println("인스턴스 소유의 변수에 접근하여 값을 가져온다 -> " + stu01.age);
		System.out.println("인스턴스 소유의 변수에 접근하여 값을 가져온다 -> " + stu01.address); 
		System.out.println("인스턴스 소유의 변수에 접근하여 값을 가져온다 -> " + stu01.stuId); 
		*/
		
		// setter , getter 접근
		System.out.println("인스턴스 소유의 메서드에 접근 -> " + stu01.getName());  
		stu01.setName("정민지") ; 
		System.out.println("인스턴스 소유의 메서드에 접근 -> " + stu01.getName());  
		
		// 스페셜 생성자 호출을 통한 객체 생성 
		System.out.println();
		System.out.println("스페셜 생성자 호출을 통한 객체 생성");
		
		StudentDTO stu02 = new StudentDTO("정민지", 26, "노원구", "2018") ; 
		
		System.out.println( stu02 );
		
		System.out.println("인스턴스 소유의 메서드에 접근 -> " + stu02.getName());
		System.out.println("인스턴스 소유의 메서드에 접근 -> " + stu02.getAge());
		System.out.println("인스턴스 소유의 메서드에 접근 -> " + stu02.getAddress());
		System.out.println("인스턴스 소유의 메서드에 접근 -> " + stu02.getStuId());   
		
		// 나이 변경 후 변경된 값 확인 
		stu02.setAge(-100); 
		System.out.println("인스턴스 소유의 메서드에 접근 -> " + stu02.getAge());
		
		// 강사객체 생성후 정보 확인 
		System.out.println();
		System.out.println("강사객체 생성후 정보 확인") ; 
		
		TeacherDTO tea01 = new TeacherDTO("임섭순", 30, "서초구", "1992") ;  
		System.out.println("강사 객체 생성 - " + tea01);
		
		// 직원객체 생성후 정보 확인(EmployeeDTO - name, age, address, dept )
		EmployeeDTO emp01 = new EmployeeDTO("권태하", 30, "서초구", "교육운영팀") ;  
		System.out.println("직원 객체 생성 - " + emp01);
		
		
		
		
		
		
		
		

	}

}
