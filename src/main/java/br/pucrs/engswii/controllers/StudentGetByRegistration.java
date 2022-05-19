package br.pucrs.engswii.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.Student;
import br.pucrs.engswii.beans.StudentRegistration;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentGetByRegistration {
    
	@GetMapping("/student/{regdNum}")
	public Student getStudentById(@PathVariable("regdNum") String regdNum) {
		System.out.println("In getSTudentById");   
		Student student = StudentRegistration.getInstance().getStudent(regdNum);

        if (student == null){
            // @ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Student id not found")
            // return HttpStatus.NOT_FOUND;
            // alterar status de retorno
        }

        return student;
	}
}
