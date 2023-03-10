package com.student.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.student.entity.StudentEntity;


@Repository
public interface StudentDao extends JpaRepository<StudentEntity, Long> {

	StudentEntity getStudentByStudentEmail(String studentEmail);

}
