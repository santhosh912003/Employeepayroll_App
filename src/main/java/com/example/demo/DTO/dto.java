package com.example.demo.DTO;

import jakarta.validation.constraints.NotNull;

public class dto {
	@NotNull(message= "Employee name can not be empty" )
	private String name;
	@NotNull(message="Salary can not be empty")
	private Long salary;
	public dto() {
	}
	public dto(String name,Long salary) {
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary=salary;
	}
	@Override
	public String toString(){
		return "Payroll{"+
	           "name="+name+
	           "salary"+salary+
	           '}';
	}

}
