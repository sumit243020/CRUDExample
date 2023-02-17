package com.student.service;

import java.util.List;
import java.util.Optional;

import com.student.entity.StudentEntity;

public interface StudentService {

	List<StudentEntity> getAllStudents();

	StudentEntity saveStudent(StudentEntity studentEntity);

	StudentEntity updateStudent(StudentEntity studentEntity);

	void deleteStudent(Long studentId);

	Optional<StudentEntity> getStudentById(Long studentId);

	String getStudentByEmail(String studentEmail);

}
