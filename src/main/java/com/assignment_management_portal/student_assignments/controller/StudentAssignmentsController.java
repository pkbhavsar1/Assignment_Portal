package com.assignment_management_portal.student_assignments.controller;

import com.assignment_management_portal.student_assignments.entity.StudentAssignments;
import com.assignment_management_portal.student_assignments.service.StudentAssignmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentAssignmentsController {

    @Autowired
    StudentAssignmentsService studentAssignmentsService;

    @GetMapping("/students_assignments")
    public ResponseEntity<List<StudentAssignments>> getAllStudentsAssignment(){
        return new ResponseEntity<>(studentAssignmentsService.getAllStudentsAssignment(), HttpStatus.OK);
    }

    @GetMapping("/students_assignments/{studentId}")
    public StudentAssignments getAssignmentByStudentId(@PathVariable Long studentId){
        return studentAssignmentsService.getAssignmentByStudentId(studentId);
    }

    @PostMapping("/students_assignments")
    public StudentAssignments addAssignmentToStudent(@RequestBody StudentAssignments assignment){
        return studentAssignmentsService.addAssignmentToStudent(assignment);
    }

    @PutMapping("/students_assignments/{studentAssignmentId}")
    public StudentAssignments updateAssignmentOfStudent(@PathVariable Long studentAssignmentId, @RequestBody StudentAssignments assignment){
        return studentAssignmentsService.updateAssignmentOfStudent(studentAssignmentId, assignment);
    }

    @DeleteMapping("/students_assignments/studentId")
    public void deleteStudentAssignment(@PathVariable Long studentId){
        studentAssignmentsService.deleteStudentAssignment(studentId);
    }
}
