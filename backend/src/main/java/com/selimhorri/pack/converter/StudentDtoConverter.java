package com.selimhorri.pack.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.selimhorri.pack.model.dto.StudentDto;
import com.selimhorri.pack.model.entity.Student;

@Component
public class StudentDtoConverter implements Converter<Student, StudentDto> {
	
	@Override
	public StudentDto convert(final Student source) {
		
		final StudentDto studentDto = new StudentDto();
		studentDto.setStudentId(source.getStudentId());
		studentDto.setFirstName(source.getFirstName());
		studentDto.setLastName(source.getLastName());
		studentDto.setEnterDate(source.getEnterDate().toString());
		studentDto.setEmail(source.getEmail());
		studentDto.setPhone(source.getPhone());
		studentDto.setSchoolId(source.getSchool().getSchoolId());
		
		return studentDto;
	}
	
	
	
}






