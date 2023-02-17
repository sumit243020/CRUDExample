package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@Entity
public class StudentEntity {

	@Id
	private Long studentId;
	
	private String studentName;
	private String studentDept;
	private String studentEmail;
	private String studentAddress;
	
}
