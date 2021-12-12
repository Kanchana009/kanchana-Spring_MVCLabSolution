package com.collegefest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.collegefest.entity.Student;

@Service
public interface StudentService {

	public List<Student> findAll();

	Student findById(int id);

	void save(Student student);

	void deleteById(int id);

}
