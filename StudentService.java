package com.gl.SpringProject.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.gl.SpringProject.entity.Student;
@Service  
public interface StudentService {

public List<Student> findAll();
	
	Student findById(int id);
	
	void save(Student student);
	
	void deleteById(int id);
	
	List<Student> searchBy(String name, String country);

	
	
}
