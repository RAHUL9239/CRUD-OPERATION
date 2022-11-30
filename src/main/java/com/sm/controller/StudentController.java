package com.sm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.sm.api.Student;
import com.sm.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	

	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
		List<Student> studentList = studentService.loadStudents();
		model.addAttribute("students", studentList);
		return "student-list";
	}

	@GetMapping("/showAddStudentPage")
	public String addStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "add-student";
	}

	@PostMapping("/save-student")
	public String saveStudent(Student student) {

		System.out.println(student);

		if (student.getId() == 0) {
			studentService.saveStudent(student);
		} else {
			studentService.update(student);
		}

		return "redirect:/showStudent";
	}

	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId") int id, Model model) {

		System.out.println("looking the data " + id);

		Student theStudent = studentService.getStudent(id);
		System.out.println(theStudent);

		model.addAttribute("student", theStudent);
		
		
		
		return "add-student";
	}

	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("userId") int id) {

		studentService.deleteStudent(id);

		return "redirect:/showStudent";
	}

}
