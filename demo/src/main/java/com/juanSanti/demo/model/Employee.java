package com.juanSanti.demo.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String firstName;
	private String lastName;
	private String role;
	private Double salary;
	private LocalDate birthday;
	private int age;
	
	
	public Employee() {
		
	}

	public Employee(String firstName, String lastName, String role, Double salary, LocalDate birthday) throws ParseException {
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.salary = salary;
		this.birthday = birthday;
		setEmployeeAge();
	}

	@Override
	public String toString () {
		return firstName + " " + lastName + ", with " + age + " years old, works as " + role + ", with a salary of: " + salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(employeeId, firstName, lastName, role, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(employeeId, other.employeeId) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(role, other.role)
				&& Objects.equals(salary, other.salary);
	}



	public Long getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	
	public void setEmployeeAge() {
		Period edad = Period.between(birthday, LocalDate.now());
		age = edad.getYears();
	}
	
	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
}
