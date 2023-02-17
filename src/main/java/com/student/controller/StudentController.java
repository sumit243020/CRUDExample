package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.student.entity.StudentEntity;
import com.student.service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getAllStudents")
	public List<StudentEntity> getAllStudents() {
		
		return studentService.getAllStudents();
		
	}
	
	@PostMapping("/addStudent")
	public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity) {
	
		return studentService.saveStudent(studentEntity);
		
	}
	
	@PutMapping("/updateStudent")
	public StudentEntity updateStudent(@RequestBody StudentEntity studentEntity) {
		
		return studentService.updateStudent(studentEntity);
		
	}
	
	@DeleteMapping("/deleteStudent/{studentId}")
	public void deleteStudent(@PathVariable("studentId") Long studentId) {
		
	  System.out.println("Record Deleted");
	  studentService.deleteStudent(studentId);
		
	}
	
	@GetMapping("/getStudentById/{studentId}")
	public Optional<StudentEntity> getStudentById(@PathVariable("studentId") Long studentId) {
		
		return studentService.getStudentById(studentId);
		
	}
	
	@GetMapping("/getStudentByEmail/{studentEmail}")
	public String getStudentByEmail(@PathVariable("studentEmail") String studentEmail ) {
		
		 return studentService.getStudentByEmail(studentEmail);
		
	}
	
}
