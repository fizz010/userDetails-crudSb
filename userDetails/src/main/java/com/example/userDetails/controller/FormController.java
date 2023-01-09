package com.example.userDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.userDetails.repository.UserRepo;
import com.example.userDetails.service.ServeUser;
import com.example.userDetails.userdto.UserD;

import antlr.collections.List;


@Controller
public class FormController {
	@Autowired
	private ServeUser seveuser;
	
	@GetMapping("/main")
	public String main() {	
		return "home";
	}
	
	@GetMapping("/index")
	public String getDetails() {	
		return "userdell";
	}
	
	@PostMapping("/call")
	public String add(@ModelAttribute UserD userD) {
		
		seveuser.save(userD);
		return "userdell";
	}
	
	@GetMapping("/delete")
	public String delDetails() {	
		return "dell";
	}
	
	@GetMapping("/bye")
	public String deleted(@RequestParam int id ) {
		seveuser.delete1(id);
		return "redirect:/list";

	}
	@GetMapping("/list")
	public String getAllUser(Model model) {
		model.addAttribute("UserD",seveuser.getAll());
		return "table";
		
	}
}
