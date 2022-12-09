package com.beans;

import java.util.Objects;

public class Book {
	String isbn, name, price;

	public Book() {
		super();
	}

	public Book(String isbn, String name, String price) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return this.name.length() / 2;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn) && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price);
	}

}
