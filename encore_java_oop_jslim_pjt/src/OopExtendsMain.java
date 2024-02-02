import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;

public class OopExtendsMain {

	public static void main(String[] args) {
		// 객체생성 
		StudentDTO stu01 = new StudentDTO("정민지", 26, "노원구", "2018") ;
		System.out.println( stu01.personInfo() );
		System.out.println( stu01.studentInfo() ); 
		
		// 객체생성
		TeacherDTO tea01 = new TeacherDTO("정민지", 26, "노원구", "자바") ;
		System.out.println( tea01.personInfo() );
		System.out.println( tea01.teacherInfo() ); 
		
		// 객체생성
		EmployeeDTO emp01 = new EmployeeDTO("정민지", 26, "노원구", "교육 운영팀") ;
		System.out.println( emp01.personInfo() );
		System.out.println( emp01.employeeInfo() ); 
		
	}

}


