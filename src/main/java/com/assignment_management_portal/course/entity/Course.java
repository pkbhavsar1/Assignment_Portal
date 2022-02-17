package com.assignment_management_portal.course.entity;

import com.assignment_management_portal.student.entity.Students;
import com.assignment_management_portal.teacher.entity.Teacher;
import com.assignment_management_portal.teacher_assignments.entity.TeacherAssignments;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseId;
	
	@ManyToOne
	@JoinColumn(name = "teacherId", nullable = false)
	private Teacher teacher;
	
	private String courseName;
	
	@OneToMany(mappedBy = "course")
	private Set<TeacherAssignments> teacherAssignment;
	
	@OneToMany(mappedBy = "course")
	private Set<Students> students;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(Long courseId, Teacher teacher, String courseName, Set<TeacherAssignments> teacherAssignment,
			Set<Students> students) {
		super();
		this.courseId = courseId;
		this.teacher = teacher;
		this.courseName = courseName;
		this.teacherAssignment = teacherAssignment;
		this.students = students;
	}

	public Course(Teacher teacher, String courseName, Set<TeacherAssignments> teacherAssignment,
			Set<Students> students) {
		super();
		this.teacher = teacher;
		this.courseName = courseName;
		this.teacherAssignment = teacherAssignment;
		this.students = students;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Set<TeacherAssignments> getTeacherAssignment() {
		return teacherAssignment;
	}

	public void setTeacherAssignment(Set<TeacherAssignments> teacherAssignment) {
		this.teacherAssignment = teacherAssignment;
	}

	public Set<Students> getStudents() {
		return students;
	}

	public void setStudents(Set<Students> students) {
		this.students = students;
	}
	
	
}
