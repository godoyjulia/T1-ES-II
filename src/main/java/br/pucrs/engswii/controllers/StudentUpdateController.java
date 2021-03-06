package br.pucrs.engswii.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.Student;
import br.pucrs.engswii.beans.StudentRegistration;
import br.pucrs.engswii.beans.UserLogin;

@RestController
public class StudentUpdateController {

//	@RequestMapping(method = RequestMethod.PUT, value="/update/student")
//
//
//	@ResponseBody
	@PutMapping("/update/student")
	public ResponseEntity<String> updateStudentRecord(@RequestBody Student stdn) {
		System.out.println("In updateStudentRecord");   
		if (!UserLogin.getInstance().isSomeoneLogged()){
			System.out.println("Nenhum usuário logado.");
        	return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
		return new ResponseEntity<>(StudentRegistration.getInstance().upDateStudent(stdn), HttpStatus.OK);
	}

}
