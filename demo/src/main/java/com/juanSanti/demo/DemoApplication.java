package com.juanSanti.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.juanSanti.demo.model.Employee;
import com.juanSanti.demo.service.EmployeeService;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return (args) -> {
			
			System.out.println("\nDeleting employees....");
			employeeService.deleteAllEmployees();
			
			System.out.println("Adding employees....\n");
			employeeService.addEmployee(new Employee("Juan", "Sanchez", "Student", 1000000.00, LocalDate.of(2003, 03, 11)));
			
			employeeService.addEmployee(new Employee("Jorge", "Useche", "Teacher", 1000.00, LocalDate.of(1992, 03, 11)));
			
			System.out.println("\nGetting all employees....");
			employeeService.getAllEmployees().forEach(employee -> System.out.println(employee));
			
			
			
		};
	}

}

