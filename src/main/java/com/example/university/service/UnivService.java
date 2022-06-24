package com.example.university.service;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.university.entity.UnivDetails;
import com.spring.exam.entity.UnivClass;
import com.spring.exam.repository.UniviRepository;


public class UnivService {
	@Service
	public class UnivService {

		@Autowired
		private UniviRepository repository;

		// to add the student
		public UnivDetails addStudent(StudentClass student) {
			return repository.save(student);
		}

		// to get the student based on his id
		public StudentClass getStudentById(int id) {
			return repository.findById(id).orElse(null);
		}

		// to get all the students
		public List<StudentClass> getAllStudents() {
			return repository.findAll();
		}

		// to get the element based on ascending order
		public List<StudentClass> getAllStudentsAscendingOrder() {
			List<StudentClass> list = repository.findAll();

			list.sort(new Comparator<StudentClass>() {
				@Override
				public int compare(StudentClass o1, StudentClass o2) {
					return o1.getName().compareTo(o2.getName());
				}

			});

			return list;
		}

		// to edit the student
		public StudentClass editStudent(StudentClass student) {
			StudentClass ExistingStudent = repository.findById(student.getId()).orElse(null);
			ExistingStudent.setName(student.getName());
			ExistingStudent.setMarks(student.getMarks());
			return repository.save(ExistingStudent);
		}

		// to delete the student
		public String deleteStudent(int id) {
			repository.deleteById(id);
			return "student deleted";
		}

	}

	public com.example.university.controller.List<UnivDetails> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public void getStudentById(int id) {
		// TODO Auto-generated method stub
		
	}





}
