package collectionstutotial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person> {
	int id;
	String name;

	public Person() {
		super();
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Person p) {// to sort by id
		return this.getId() - p.getId();
	}

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		Person p1 = new Person(1011, "sandeep");
		Person p2 = new Person(102, "abhay");
		Person p3 = new Person(102, "rudra");
		Person p4 = new Person(1304, "adhiraj");
		Person p5 = new Person(105, "ajay");

		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);

		Collections.sort(persons);
		// below line of code also works same as above line.
		// Collections.sort(persons, Comparator.comparing(Person::getId));
		System.out.println(persons);
	}
}
