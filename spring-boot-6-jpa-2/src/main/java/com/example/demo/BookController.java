package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@Autowired
	BookRepository bookRepository;

	@GetMapping("/books/{id}")
	Optional<Book> getBook(@PathVariable Long id) {
		Optional<Book> b = bookRepository.findById(id);
		if (b.isPresent())
			return b;
		else
			return null;
	}
}
