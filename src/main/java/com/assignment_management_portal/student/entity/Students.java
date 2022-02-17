package com.assignment_management_portal.student.entity;

import com.assignment_management_portal.course.entity.Course;
import com.assignment_management_portal.student_assignments.entity.StudentAssignments;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studnetId;
	
	@ManyToOne
	@JoinColumn(name = "courseId", nullable = false)
	private Course course;
	
	private String firstName;
	
	private String lastName;
	
	private Gender gender;
	
	@OneToMany(mappedBy = "students")
	private Set<StudentAssignments> studentAssignments;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(Long studnetId, Course course, String firstName, String lastName, Gender gender,
			Set<StudentAssignments> studentAssignments) {
		super();
		this.studnetId = studnetId;
		this.course = course;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.studentAssignments = studentAssignments;
	}

	public Students(Course course, String firstName, String lastName, Gender gender,
			Set<StudentAssignments> studentAssignments) {
		super();
		this.course = course;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.studentAssignments = studentAssignments;
	}

	public Long getStudnetId() {
		return studnetId;
	}

	public void setStudnetId(Long studnetId) {
		this.studnetId = studnetId;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Set<StudentAssignments> getStudentAssignments() {
		return studentAssignments;
	}

	public void setStudentAssignments(Set<StudentAssignments> studentAssignments) {
		this.studentAssignments = studentAssignments;
	}

		
}
