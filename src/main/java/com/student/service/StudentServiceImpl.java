package com.student.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.dao.StudentDao;
import com.student.entity.StudentEntity;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public List<StudentEntity> getAllStudents() {

		return studentDao.findAll();
	}

	@Override
	public StudentEntity saveStudent(StudentEntity studentEntity) {

		return studentDao.save(studentEntity);
	}

	@Override
	public StudentEntity updateStudent(StudentEntity studentEntity) {

		return studentDao.save(studentEntity);
	}

	@Override
	public void deleteStudent(Long studentId) {
		studentDao.deleteById(studentId);
	}

	@Override
	public Optional<StudentEntity> getStudentById(Long studentId) {

		return studentDao.findById(studentId);
	}

	@Override
	public String getStudentByEmail(String studentEmail) {
		
		String result = null;
		try {
			StudentEntity studentEntity = studentDao.getStudentByStudentEmail(studentEmail);
			if (studentEntity.getStudentEmail().equals(studentEmail)) {
				
				result = "YES record is available :" + studentEmail;
				
			} else {
				result = "Record is not available ";
			}
				
		} catch(Exception e) {
			return e.getLocalizedMessage();
			
		}
		return result;
		
		
		
//		List<StudentEntity> email = new ArrayList<>();
//		
//		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//			StudentEntity studentEntity = (StudentEntity) iterator.next();
//			
//			if(studentEmail.equals(studentEntity.getStudentEmail()))
//			{
//				System.out.println("Student is present for email :" + studentEmail);
//			} else {
//				System.out.println("Student is not present for email :" + studentEmail);
//			}
//		}
		
	
	}
	

}
