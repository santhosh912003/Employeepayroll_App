package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name="Emppayroll")
public class Model {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Name")
	private String name;
	@Column(nullable=false)
	private double salary;
	@Override
	public String toString(){
		return "Payroll{"+
	           "id="+id+
	           "name="+name+
	           "salary"+salary+
	           '}';
	}
	public Model() {}
	public Model(String name,Double salary) {
		this.name=name;
		this.salary=salary;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id=id;
	}
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}

}
