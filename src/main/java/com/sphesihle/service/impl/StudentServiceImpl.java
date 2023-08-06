package com.sphesihle.service.impl;

import com.sphesihle.entity.Student;
import com.sphesihle.repository.StudentRepository;
import com.sphesihle.service.StudentService;
import com.sphesihle.service.dto.StudentDTO;
import com.sphesihle.service.mapper.StudentMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;
import java.util.UUID;

@Slf4j
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }


    @Override
    public StudentDTO save(StudentDTO studentDTO) {
        log.debug("Request to save a student : {} ", studentDTO);

        Student student = studentMapper.toEntity(studentDTO);

        student = studentRepository.save(student);

        return studentMapper.toDto(student);
    }

    @Override
    public Optional<StudentDTO> findOne(UUID id) {

        return studentRepository.findById(id).map(studentMapper::toDto);
    }
}
