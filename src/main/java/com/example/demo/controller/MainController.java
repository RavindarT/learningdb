package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.repo.Employees;
import com.example.demo.repo.EmployeeRepository;

@Controller 
@RequestMapping(path="/demo") 
public class MainController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping(path="/demo")
	@ResponseBody
	public List<Employees> getAllUsers() {
		System.out.println("test"+employeeRepository);
		// This returns a JSON or XML with the users
		List<Employees> emps = employeeRepository.findAllByEmpid(1);
		
		System.out.println("size:::"+emps.size());
		System.out.println("size:::"+employeeRepository.findAll());
		if(emps != null && emps.size() > 0) {		
			Employees s = (Employees)emps.get(0);
			emps.forEach( x -> {
				System.out.println(x.getEmpname());
			});
		}
		return emps ;
	}
}
