package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot5Jpa1Application implements CommandLineRunner {
	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot5Jpa1Application.class, args);
		System.out.println("App Running !!");
	}

	@Override
	public void run(String... args) throws Exception {
		// 1.-----------------------------------------------------------------------------------
		bookRepository.save(new Book("maths", "123BHN"));
		bookRepository.save(new Book("science", "365BUN"));
		bookRepository.save(new Book("english", "526BHN"));
		System.out.println("Data Inserted !!\n");

		// 2.-----------------------------------------------------------------------------------
		System.out.println("All availabele books are : \n");
		for (Book i : bookRepository.findAll()) {
			System.out.println(i);
		}
		System.out.println();

		// 3.-----------------------------------------------------------------------------------
		// case when we are sure that b will never be assigned null
		Book b = bookRepository.findById(2L).get();// here get method returns Book type object from Optional<Book> type
													// object
		System.out.println("searched Book details are : " + b);

		// 4.-----------------------------------------------------------------------------------
		// case when b can be assigned null we use Optional<Book> to handle that
		Optional<Book> b1 = bookRepository.findById(4L);
		if (b1.isPresent())
			System.out.println("searched Book details are : " + b);
		else
			System.out.println("Book not exist with this id ");

		// 5.-----------------------------------------------------------------------------------
		Book obj1 = new Book("Geography", "862HUN");
		Book obj2 = new Book("Economics", "539BGU");
		Book obj3 = new Book("History", "964XFT");
		Book obj4 = new Book("Politics", "462KIL");
		Book obj5 = new Book("Physics", "632NIU");
		Book obj6 = new Book("Chemistry", "562HIN");
		List<Book> list1 = new ArrayList();
		list1.add(obj1);
		list1.add(obj2);
		list1.add(obj3);
		list1.add(obj4);
		list1.add(obj5);
		list1.add(obj6);

		bookRepository.saveAll(list1);
		System.out.println("All availabele books are : \n");
		for (Book i : bookRepository.findAll()) {
			System.out.println(i);
		}
		System.out.println();
		// 6.-----------------------------------------------------------------------------------
		boolean result1 = bookRepository.existsById(2L);
		boolean result2 = bookRepository.existsById(56L);
		System.out.println("bookRepository.existsById(2L) : " + result1);
		System.out.println("bookRepository.existsById(56L) : " + result2);

		// 7.-----------------------------------------------------------------------------------

		System.out.println("\nfindAllById() : \n");
		List<Long> inputList1 = Arrays.asList(2L, 4L, 5L, 7L, null);
		List<Book> list2 = (List<Book>) bookRepository.findAllById(inputList1);
		for (Book i : list2)
			System.out.println(i);

		// 8.-----------------------------------------------------------------------------------

		System.out.println("bookRepository.count() : " + bookRepository.count());

		// 9.-----------------------------------------------------------------------------------
		bookRepository.deleteById(2L);
		System.out.println("All availabele books are : \n");
		for (Book i : bookRepository.findAll()) {
			System.out.println(i);
		}
		System.out.println();
		// 10.-----------------------------------------------------------------------------------

		// 11.-----------------------------------------------------------------------------------
		// 12.-----------------------------------------------------------------------------------
		/*
		 * @Override public void delete(Book entity) { // TODO Auto-generated method
		 * stub
		 * 
		 * }
		 * 
		 * @Override public void deleteAllById(Iterable<? extends Long> ids) { // TODO
		 * Auto-generated method stub
		 * 
		 * }
		 * 
		 * @Override public void deleteAll(Iterable<? extends Book> entities) { // TODO
		 * Auto-generated method stub
		 * 
		 * }
		 * 
		 * @Override public void deleteAll() { // TODO Auto-generated method stub
		 */
	}

}
