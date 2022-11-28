package com.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {
	
	
	//  ${}=variable expression
	@RequestMapping("/variable-expression")
	public String variable_expression(Model model) {
		Student student = new Student(1,"vivek","bhandara","vivek@gmail.com");
		model.addAttribute("student", student);
		model.addAttribute("name", "vivek");
		return "variable-expression";
		
	}
	
	//  *{}=selection expression
	@RequestMapping("/selection-expression")
	public String selection_expression(Model model) {
		Student student = new Student(1,"vivek","bhandara","vivek@gmail.com");
		model.addAttribute("student", student);
		return "selection-expression";
	}
	
	//             #{} message expression 
	// ak extra file  resources madhecreate keli tyat data takla 
	//        to ata access karacaha 
	//basically akhadi motha msg ikd kasa lihal , mhanun to tikde liha and ikd access kra 
	// pn to key value pair madhe aste 
	
	@RequestMapping("/message-expression")
	public String message_expression() {
		return "message-expression";
	}
	
	// @{}---link provide krte
	@RequestMapping("/link-expression")
	public String linkExpression(Model model) {
		model.addAttribute("id", 1);
		return "link_expression";
	}
	
	// ~{} ---header footer
	@RequestMapping("/fragment-expression")
	public String fragmentExpression() {
		return "fragment_expression";
	}

	// if-unless
	@RequestMapping("/if-unless")
	public String ifUnless(Model model) {
		
		User u1 = new User("mike","Admin","mike@gmail.com");
		User u2 = new User("stallin","User","stallin@gmail.com");
		User u3 = new User("smith","User","smith@gmail.com");
		
		List<User> users = new ArrayList<User>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		
		model.addAttribute("users", users);
		
		return "if_unless";
	}
	
	// switch case
	@RequestMapping("/switch-case")
	public String switchCase(Model model) {
		User u1 = new User("mike","Admin","mike@gmail.com");
		model.addAttribute("user", u1);
		return "switch_case";
	}


	@RequestMapping("/for-each")
	public String forEachStatement(ModelMap model) {
		Student student1 = new Student(1,"stallin","chennai","stallin@gmail.com");
		Student student2 = new Student(2,"stallin2","chennai2","stallin2@gmail.com");
		Student student3 = new Student(3,"stallin3","chennai2","stallin2@gmail.com");
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		model.addAttribute("students", students);
		return "for_each";
	}
	
}
