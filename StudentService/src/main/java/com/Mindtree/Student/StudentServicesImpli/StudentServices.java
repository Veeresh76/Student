package com.Mindtree.Student.StudentServicesImpli;

import java.util.Collections;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mindtree.Student.Entity.Student;
import com.Mindtree.Student.Repository.StudentRepository;
import com.Mindtree.Student.Sorting.SortByAge;
import com.Mindtree.Student.Sorting.SortByName;


@Service
public class StudentServices {

	@Autowired
	StudentRepository studentRepository;
	
public 	void test() {
		Student s1=new Student("abc","Male",23,101);
		Student s2=new Student("sdf","Male",23,101);
		Student s3=new Student("ghj","Male",23,101);
		Student s4=new Student("jkl","Male",23,101);
		studentRepository.save(s1);
		studentRepository.save(s2);
		studentRepository.save(s3);
		studentRepository.save(s4);
	}
	
	
	
	
	//returns sorts based on Age
public List<Student>getStudentbyDidSBA(int cid) {
		
	List<Student>ll= studentRepository.findByCid(cid);
	
	Collections.sort(ll,new SortByAge());
	
	return ll;
	}

//returns sorts based on Name
public List<Student>getStudentbyDidSBN(int cid) {
	
List<Student>ll= studentRepository.findByCid(cid);

Collections.sort(ll,new SortByName());

return ll;
}
	
//add student
	public Student addStudent(Student s) {
		
		return studentRepository.save(s);
	}

//grt student by id
	public Student getStuById(int rollnum) {
		studentRepository.findById(rollnum);
		return null;
	}

}
