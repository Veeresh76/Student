package com.Mindtree.Student.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rollnum;
	
	private String name;
	
	private String gender;
	
	private int age;

	private int cid;
	
	public Student(int rollnum, String name, String gender, int age, int cid) {
		super();
		this.rollnum = rollnum;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.cid = cid;
	}
	
	public Student( String name, String gender, int age, int cid) {
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.cid = cid;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollnum() {
		return rollnum;
	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Student [rollnum=" + rollnum + ", name=" + name + ", gender=" + gender + ", age=" + age + ", cid=" + cid
				+ "]";
	}


	

	
	
}
