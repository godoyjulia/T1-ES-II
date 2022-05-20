package br.pucrs.engswii.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.pucrs.engswii.beans.Subject;
import br.pucrs.engswii.beans.SubjectRegistration;
import br.pucrs.engswii.beans.SubjectRegistrationReply;
import br.pucrs.engswii.beans.UserLogin;

public class SubjectRegistrationController {
    
    @PostMapping("/register/subject")
    public ResponseEntity<SubjectRegistrationReply> registerSubject(@RequestBody Subject subject){
		System.out.println("In registerSubject");
		if (!UserLogin.getInstance().isSomeoneLogged()){
			System.out.println("Nenhum usuário logado.");
        	return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
        SubjectRegistrationReply subjectReply = new SubjectRegistrationReply();
        SubjectRegistration.getInstance().add(subject);

        subjectReply.setName(subject.getName());
        subjectReply.setId(subject.getId());
        subjectReply.setSchedule(subject.getSchedule());
        subjectReply.setRegistrationStatus("Successful");

        return new ResponseEntity<>(subjectReply, HttpStatus.OK);
    }
}
