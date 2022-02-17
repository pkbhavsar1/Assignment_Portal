package com.assignment_management_portal.student_assignments.service;

import com.assignment_management_portal.student_assignments.entity.StudentAssignments;
import com.assignment_management_portal.student_assignments.repository.StudentAssignmentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class StudentAssignmentsServiceImpl implements StudentAssignmentsService {

    @Autowired
    StudentAssignmentsRepo studentAssignmentsRepo;

    @Override
    public List<StudentAssignments> getAllStudentsAssignment() {
        return studentAssignmentsRepo.findAll();
    }

    @Override
    public StudentAssignments getAssignmentByStudentId(Long studentId) {
        return studentAssignmentsRepo.getById(studentId);
    }

    @Override
    public StudentAssignments addAssignmentToStudent(StudentAssignments assignment) {
        return studentAssignmentsRepo.save(assignment);
    }

    @Override
    public StudentAssignments updateAssignmentOfStudent(Long studentAssignmentId, StudentAssignments assignment) {
        if (studentAssignmentsRepo.findById(studentAssignmentId).isPresent()){
            studentAssignmentsRepo.deleteById(studentAssignmentId);
            return addAssignmentToStudent(assignment);
        }
        return null;
    }


    @Override
    public void deleteStudentAssignment(Long studentId) {
        studentAssignmentsRepo.deleteById(studentId);
    }


}
