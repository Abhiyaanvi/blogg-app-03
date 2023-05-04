package in.abhi_devoloper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.abhi_devoloper.bindingclasses.UserDto;

import in.abhi_devoloper.service.UserService;

@Controller
public class UserController {
   
	@Autowired
	private UserService service;
	
	
	@PostMapping("/register-user")
	public String registerUser(@ModelAttribute("dto")UserDto dto, Model model) {		
		UserDto userDto = service.registerUser(dto);
		model.addAttribute("userDto", userDto);
		return "reg_page";
	}
	
	
	@GetMapping("/user")
	public String loadForm(Model model) {
		model.addAttribute("dto", new UserDto());
		return "reg_page";
	}
	
	 
}
