package com.assignment_management_portal.teacher.entity;

import com.assignment_management_portal.course.entity.Course;
import com.assignment_management_portal.teacher_assignments.entity.TeacherAssignments;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long teacherId;
	
	private String firstName;
	
	private String lastName;
	
	private Department department;
	
	@OneToMany(mappedBy = "teacher")
	private Set<Course> course;
	
	@OneToMany(mappedBy = "teacher")
	private Set<TeacherAssignments> teacherAssignments;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(Long teacherId, String firstName, String lastName, Department department, Set<Course> course,
			Set<TeacherAssignments> teacherAssignments) {
		super();
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.course = course;
		this.teacherAssignments = teacherAssignments;
	}

	public Teacher(String firstName, String lastName, Department department, Set<Course> course,
			Set<TeacherAssignments> teacherAssignments) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.course = course;
		this.teacherAssignments = teacherAssignments;
	}

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	public Set<TeacherAssignments> getTeacherAssignments() {
		return teacherAssignments;
	}

	public void setTeacherAssignments(Set<TeacherAssignments> teacherAssignments) {
		this.teacherAssignments = teacherAssignments;
	}

}
