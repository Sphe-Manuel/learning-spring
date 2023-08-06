package com.sphesihle.controller;

import com.sphesihle.repository.StudentRepository;
import com.sphesihle.service.StudentService;
import com.sphesihle.service.dto.StudentDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    private final StudentRepository studentRepository;

    public StudentController(StudentService studentService, StudentRepository studentRepository) {
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }

    @GetMapping("{id}")
    public ResponseEntity<StudentDTO> getStudent(@PathVariable UUID id){

        log.debug("Request to get a Student by id {} : ", id );

        Optional<StudentDTO> optionalStudentDTO = studentService.findOne(id);

        return ResponseEntity.ok(optionalStudentDTO.orElseThrow(RuntimeException::new));

    }
}
