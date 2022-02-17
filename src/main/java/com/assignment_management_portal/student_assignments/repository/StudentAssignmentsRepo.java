package com.assignment_management_portal.student_assignments.repository;

import com.assignment_management_portal.student_assignments.entity.StudentAssignments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentAssignmentsRepo extends JpaRepository<StudentAssignments, Long> {

}
