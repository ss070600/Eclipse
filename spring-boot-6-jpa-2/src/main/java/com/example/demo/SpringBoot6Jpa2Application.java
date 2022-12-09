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
public class SpringBoot6Jpa2Application implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot6Jpa2Application.class, args);
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
		Book obj5 = new Book("Physics", "123");
		Book obj6 = new Book("Chemistry", "562HIN");
		Book obj7 = new Book("Chem 1", "562HIN");
		Book obj8 = new Book("Chem ACS", "562HIO");
		Book obj9 = new Book("Chem 459", "562HBU");
		Book obj10 = new Book("maths", "562HBU");
		Book obj11 = new Book("maths", "562HBU");
		Book obj12 = new Book("science", "123");
		List<Book> list1 = new ArrayList();
		list1.add(obj1);
		list1.add(obj2);
		list1.add(obj3);
		list1.add(obj4);
		list1.add(obj5);
		list1.add(obj6);
		list1.add(obj7);
		list1.add(obj8);
		list1.add(obj9);
		list1.add(obj10);
		list1.add(obj11);
		list1.add(obj12);

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
		System.out.println("bookRepository.findByTitle(\"maths\") : >>>>>>>>>>>");
		for (Book i : bookRepository.findByTitle("maths"))
			System.out.println(i);

		System.out.println();
		System.out.println("\nbookRepository.findByTitleOrIsbn(\"Politics\", \"526BHN\") : >>>>>>>>>>>\n");
		for (Book i : bookRepository.findByTitleOrIsbn("Politics", "526BHN"))
			System.out.println(i);
		System.out.println();

		System.out.println("bookRepository.OrderByTitleAsc() : >>>>>>>>>>>");
		for (Book i : bookRepository.OrderByTitleAsc()) {
			System.out.println(i);
		}

		System.out.println();
		System.out.println("bookRepository.findByTitleOrIsbnOrderByTitleDesc(\"Politics\",\"526BHN\") : >>>>>>>>>>>");
		for (Book i : bookRepository.findByTitleOrIsbnOrderByTitleDesc("Politics", "526BHN")) {
			System.out.println(i);
		}

		System.out.println();
		System.out.println("bookRepository.countByTitleOrIsbn(\"maths\", \"123\") : "
				+ bookRepository.countByTitleOrIsbn("maths", "123"));

		// 12.-----------------------------------------------------------------------------------
		System.out.println();
		System.out.println("bookRepository.findItThroughTitle(\"Politics\") : >>>>>>>>>>>"
				+ bookRepository.findItThroughTitle("Politics"));
		System.out.println("bookRepository.findBookWithTitle(\"Chemistry\") : >>>>>>>>>>>"
				+ bookRepository.findBookWithTitle("Chemistry"));

		System.out.println();
		System.out.println("bookRepository.findUsersByKeyword(\"chem\") : >>>>>>>>>>>");
		for (Book i : bookRepository.findUsersByKeyword("chem")) {
			System.out.println(i);
		}

		// 12.-----------------------------------------------------------------------------------
		System.out.println();
		System.out.println("bookRepository.updateBook(\"Geography part 1\", 4) : >>>>>>>>>>>");
		bookRepository.updateBook("Geography part 1", 4);
		Optional<Book> b2 = bookRepository.findById(4L);
		if (b2.isPresent())
			System.out.println("searched Book details are : " + b2);
		else
			System.out.println("Book not exist with this id ");
	}

}
