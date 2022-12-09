package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends CrudRepository<Book, Long> {
	
	Book findByIsbn(String isbn);

	List<Book> findByTitle(String title);

	List<Book> findByTitleOrIsbn(String title, String isbn);

	List<Book> OrderByTitleAsc();
	
	List<Book> findByTitleOrIsbnOrderByTitleDesc(String title, String isbn);
	
	Long countByTitleOrIsbn(String title, String isbn);

	@Query(value = "select * from book where title=?", nativeQuery = true)
	Book findItThroughTitle(String title);

	@Query(name = "Book.findTitleQuery")
	Book findBookWithTitle(String title);

	@Query(value="select * from book b where b.title like %:keyword% or b.isbn like %:keyword%", nativeQuery=true)
	List<Book> findUsersByKeyword(@Param("keyword") String keyword);
}
