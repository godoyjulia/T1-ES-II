package br.pucrs.engswii.controllers;

import java.util.List;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.*;

@RestController
public class UserRegistrationController {

	//  @RequestMapping(method = RequestMethod.POST, value="/register/student")
	//
	//  @ResponseBody
	@PostMapping("/register/user")
	public UserRegistrationReply registerUser(@RequestBody User user) {
		System.out.println("In registerUser");
		
		UserRegistrationReply userregreply = new UserRegistrationReply();           
		UserRegistration.getInstance().add(user);
		UserLogin.addUser(user.getRegistrationNumber(), user.getPassword());

		//We are setting the below value just to reply a message back to the caller
		userregreply.setName(user.getName());
		userregreply.setRegistrationNumber(user.getRegistrationNumber());
		userregreply.setRegistrationStatus("Successful");

		System.out.println("user registration list: "+ UserRegistration.getUserRecords());

		

		// UserLogin userLogin = new UserLogin();
		// userLogin.listaUsuariosLogin.put(user.getRegistrationNumber(), user.getPassword());


		return userregreply;
	}

}
