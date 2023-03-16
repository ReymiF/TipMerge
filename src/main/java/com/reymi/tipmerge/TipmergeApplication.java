package com.reymi.tipmerge;

import com.reymi.tipmerge.entity.Customer;
import com.reymi.tipmerge.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class TipmergeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TipmergeApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(TipmergeApplication.class);
	@Bean
	public CommandLineRunner demo(CustomerRepository customerRepository) {
		return (args) -> {
			// save a few customers
			/*userRepository.save(new User("Jack", "Bauer"));
			userRepository.save(new User("Chloe", "O'Brian"));
			userRepository.save(new User("Kim", "Bauer"));
			userRepository.save(new User("David", "Palmer"));
			userRepository.save(new User("Michelle", "Dessler"));*/

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : customerRepository.findAll()) {
				log.info(customer.toString());
			}

			// fetch an individual customer by ID
			Optional<Customer> customer = customerRepository.findById(1L);
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");





			/*
			// fetch customers by pseudo name
			log.info("Customer found with findByPseudo('pierre_gasly'):");
			log.info("--------------------------------------------");
			customerRepository.findByPseudo("pierre").forEach(pierre -> {
				log.info(pierre.toString());
			});
			// fetch customers by first name
			log.info("Customer found with findByFirstName('pierre'):");
			log.info("--------------------------------------------");
			customerRepository.findByFirstName("pierre").forEach(pierre -> {
				log.info(pierre.toString());
			});

			// fetch customers by last name
			log.info("Customer found with findByLastName('john'):");
			log.info("--------------------------------------------");
			customerRepository.findByLastName("john").forEach(john -> {
				log.info(john.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			//  log.info(bauer.toString());
			// }*/
			log.info("");
		};
	}

}
