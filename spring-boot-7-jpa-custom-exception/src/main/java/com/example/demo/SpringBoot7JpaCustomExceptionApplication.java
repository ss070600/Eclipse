
package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot7JpaCustomExceptionApplication implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot7JpaCustomExceptionApplication.class, args);
		System.out.println("App running !!");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bookRepository.save(new Book("thinking in Java", "987923"));
		bookRepository.save(new Book("Learn Java", "987924"));
		bookRepository.save(new Book("Java in Action", "987923"));
		System.out.println("Data inserted !!");

		for (Book book : bookRepository.findAll())
			System.out.println(book);

		Optional<Book> b = bookRepository.findById(4L);
		if (b.isPresent())
			System.out.println("Title with book id 2:-" + b.get().getTitle());
		else
			System.out.println("Book with given ID not found !!");

		Book book1 = bookRepository.findByIsbn("987924");
		System.out.println("Book matching : " + book1.getTitle());

	}

}
