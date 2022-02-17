package com.assignment_management_portal.student_assignments.service;

import com.assignment_management_portal.student_assignments.entity.StudentAssignments;

import java.util.List;
import java.util.Optional;

public interface StudentAssignmentsService {
    public List<StudentAssignments> getAllStudentsAssignment();
    public StudentAssignments getAssignmentByStudentId(Long studentId);
    public StudentAssignments addAssignmentToStudent(StudentAssignments assignment);
    public StudentAssignments updateAssignmentOfStudent(Long studentAssignmentId, StudentAssignments assignment);
    public void deleteStudentAssignment(Long studentId);

}
