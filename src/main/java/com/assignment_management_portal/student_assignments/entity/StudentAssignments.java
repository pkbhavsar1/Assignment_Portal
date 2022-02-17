package com.assignment_management_portal.student_assignments.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.assignment_management_portal.student.entity.Students;
import org.hibernate.annotations.Type;

@Entity
public class StudentAssignments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentAssignmentId;
	@ManyToOne
	@JoinColumn(name = "studentId", nullable = false)
	private Students students;
	@Type(type = "text")
	private String code;
	private boolean status;
	private LocalDate submissionDate;
	
	public StudentAssignments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentAssignments(Long studentAssignmentId, Students students, String code, boolean status,
			LocalDate submissionDate) {
		super();
		this.studentAssignmentId = studentAssignmentId;
		this.students = students;
		this.code = code;
		this.status = status;
		this.submissionDate = submissionDate;
	}

	public StudentAssignments(Students students, String code, boolean status, LocalDate submissionDate) {
		super();
		this.students = students;
		this.code = code;
		this.status = status;
		this.submissionDate = submissionDate;
	}

	public Long getStudentAssignmentId() {
		return studentAssignmentId;
	}

	public void setStudentAssignmentId(Long studentAssignmentId) {
		this.studentAssignmentId = studentAssignmentId;
	}

	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LocalDate getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(LocalDate submissionDate) {
		this.submissionDate = submissionDate;
	}
	
	
}
