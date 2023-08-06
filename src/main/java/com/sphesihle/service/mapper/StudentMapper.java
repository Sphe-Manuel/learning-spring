package com.sphesihle.service.mapper;

import com.sphesihle.entity.Student;
import com.sphesihle.service.dto.StudentDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper extends EntityMapper<StudentDTO , Student>{
    StudentDTO toDto(Student student);
}
