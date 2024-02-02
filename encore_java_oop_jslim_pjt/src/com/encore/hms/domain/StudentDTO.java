package com.encore.hms.domain;
import com.encore.hms.domain.sup.Person;

public class StudentDTO extends Person {
	private String 	stuId ; 
	public StudentDTO() {
		super();
	}
	public StudentDTO(String name, int age, String address, String stuId) {
		super(name, age, address);
		this.setStuId(stuId);
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	
	public String studentInfo() {
		// return "name=" + super.getName() + ", age=" + super.getAge() + ", address=" + super.getAddress() + ", stuId=" + this.getStuId() ; 
		return super.personInfo() + ", stuId=" + this.getStuId() ;
	}
	
	
}









