package com.spring.guides;

import com.spring.guides.caching.Customer;
import com.spring.guides.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@AllArgsConstructor
@Slf4j
public class JPAWithSpring implements CommandLineRunner {

	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(JPAWithSpring.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer firstCustomer = Customer.builder()
				.firstName("Dorian")
				.lastName("Mischie")
				.build();

		customerRepository.save(firstCustomer);

		List<Customer> customers = customerRepository.findAll();
		customers.forEach(c -> log.info(c.toString()));
	}
}
