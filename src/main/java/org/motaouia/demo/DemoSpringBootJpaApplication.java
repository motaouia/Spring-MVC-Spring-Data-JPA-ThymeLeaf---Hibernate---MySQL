package org.motaouia.demo;

import org.motaouia.demo.models.Employee;
import org.motaouia.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootJpaApplication implements CommandLineRunner{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * employeeRepository.save(new Employee("Mota", "Medo", "mota.medo@gmail.com"));
		 * employeeRepository.save(new Employee("IBRAHIMI", "Kahlid",
		 * "bra.khalid@gmail.com")); employeeRepository.save(new Employee("YOUSSFI",
		 * "Ali", "youss.ali@gmail.com"));
		 */		
	}

}
