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
public class UserLoginController {

	//  @RequestMapping(method = RequestMethod.POST, value="/register/student")
	//
	//  @ResponseBody
	@PostMapping("/login/user")
	public UserLoginReply registerUser(@RequestBody User user) {
		System.out.println("In registerUser");
		
		UserRegistrationReply userregreply = new UserRegistrationReply();           
		UserRegistration.getInstance().add(user);
		//We are setting the below value just to reply a message back to the caller
		userregreply.setName(user.getName());
		userregreply.setRegistrationNumber(user.getRegistrationNumber());
		userregreply.setRegistrationStatus("Successful");

		return userregreply;
	}

}
