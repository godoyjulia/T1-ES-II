package br.pucrs.engswii.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.Student;
import br.pucrs.engswii.beans.StudentRegistration;
import br.pucrs.engswii.beans.UserLogin;

@RestController
public class StudentRetrieveController {

	//	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
	//
	//	@ResponseBody
	@GetMapping("/student/allstudent")
	public ResponseEntity<List<Student>> getAllStudents() {
		if (!UserLogin.getInstance().isSomeoneLogged()){
			System.out.println("Nenhum usuário logado.");
        	return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
		return new ResponseEntity<>(StudentRegistration.getInstance().getStudentRecords(), HttpStatus.OK);
	}

	@GetMapping("/student/{regdNum}")
	public ResponseEntity<Student> getStudentById(@PathVariable("regdNum") String regdNum) {
		System.out.println("In getSTudentById");   
		if (!UserLogin.getInstance().isSomeoneLogged()){
			System.out.println("Nenhum usuário logado.");
        	return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
		Student student = StudentRegistration.getInstance().getStudent(regdNum);

        if (student == null){
			System.out.println("Usuário não encontrado.");
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(student, HttpStatus.OK);
	}
	
	@GetMapping("/student/{name}")
	public ResponseEntity<List<Student>> getStudentByName(@PathVariable("name") String name) {
		if (!UserLogin.getInstance().isSomeoneLogged()){
			System.out.println("Nenhum usuário logado.");
        	return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}

		List<Student> students = StudentRegistration.getInstance().getStudentRecords();
		List<Student> matches = new ArrayList<>();

		for (Student s: students){
			if(Pattern.matches(name, s.getName())){
				matches.add(s);
			}
		}

		return new ResponseEntity<>(matches, HttpStatus.OK);
	}
}
