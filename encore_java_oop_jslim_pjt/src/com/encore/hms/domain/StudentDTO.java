package com.encore.hms.domain;
import java.io.Serializable;

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
	
	// overridding(상속관계에서 부모의 메서드를 자식에서 재 정의하는 것 ) 
	// 접근지정자 반환타입 메서드명 매개변수 타입과 갯수가 일치
	@Override
	public String personInfo() {
		return super.personInfo() + ", stuId=" + this.getStuId() ;
	}
	
	
}









