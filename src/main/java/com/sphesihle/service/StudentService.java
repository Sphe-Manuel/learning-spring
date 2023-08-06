package com.sphesihle.service;

import com.sphesihle.entity.Student;
import com.sphesihle.repository.StudentRepository;
import com.sphesihle.service.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public interface StudentService {

    StudentDTO save(StudentDTO studentDTO);

    Optional<StudentDTO> findOne(UUID id);

}
