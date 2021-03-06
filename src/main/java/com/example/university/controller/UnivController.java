package com.example.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.university.entity.UnivDetails;
import com.example.university.service.UnivService;

public class UnivController {
	@RestController
	public class StudentController {
		
		@Autowired
		private UnivService service;
		
		@GetMapping("/students/{id}")
		public UnivDetails getStudentById(@PathVariable int id) {
			service.getStudentById(id);
			return null;	
		}
		
		@GetMapping("/students")
		public List<UnivDetails> getStudents(){
			return service.getAllStudents();
		}
		
		@GetMapping("/studentsbyascendingorder")
		public List<UnivDetails> getStudentsByAscendingOrder(){
			return service.getAllStudentsAscendingOrder();
		}
		
		@PostMapping("/students")
		public UnivDetails saveStudent(@RequestBody StudentClass student) {	
			return service.addStudent(student);	
		}
		
		@PutMapping("/students")
		public UnivDetails editStudent(@RequestBody StudentClass student) {
			return service.editStudent(student);
		}
		
		@DeleteMapping("/students/{id}")
		public String deleteStudent(@PathVariable int id) {
			return service.deleteStudent(id);
		}
	}


}
