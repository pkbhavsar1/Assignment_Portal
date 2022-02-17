package com.assignment_management_portal.teacher_assignments.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.assignment_management_portal.course.entity.Course;
import com.assignment_management_portal.teacher.entity.Teacher;
import org.hibernate.annotations.Type;

@Entity
public class TeacherAssignments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long assignmentId;
	
	@ManyToOne
	@JoinColumn(name = "teacherId", nullable = false)
	private Teacher teacher;
	
	@ManyToOne
	@JoinColumn(name = "courseId", nullable = false)
	private Course course;
	private LocalDate onDate;
	private LocalDate endDate;
	@Type(type = "text")
	private String question;
	@Type(type = "text")
	private String output;
	
	public TeacherAssignments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeacherAssignments(Long assignmentId, Teacher teacher, Course course, LocalDate onDate, LocalDate endDate,
			String question, String output) {
		super();
		this.assignmentId = assignmentId;
		this.teacher = teacher;
		this.course = course;
		this.onDate = onDate;
		this.endDate = endDate;
		this.question = question;
		this.output = output;
	}

	public TeacherAssignments(Teacher teacher, Course course, LocalDate onDate, LocalDate endDate, String question,
			String output) {
		super();
		this.teacher = teacher;
		this.course = course;
		this.onDate = onDate;
		this.endDate = endDate;
		this.question = question;
		this.output = output;
	}

	public Long getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(Long assignmentId) {
		this.assignmentId = assignmentId;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public LocalDate getOnDate() {
		return onDate;
	}

	public void setOnDate(LocalDate onDate) {
		this.onDate = onDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
	
	
	
}
