package Streams;

import java.util.*;
import java.util.stream.Stream;

class Person {
	int id, age;
	String name;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "person [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

}

public class StreamTesterExample {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person(1001, 23, "sandeeep"));
		personList.add(new Person(1001, 23, "sandeeep"));
		personList.add(new Person(1001, 23, "sandeeep"));
		personList.add(new Person(1001, 23, "sandeeep"));
		personList.add(new Person(1001, 23, "sandeeep"));

		Stream<Person> personStream = personList.stream();
		personStream.forEach(person -> {
			System.out.print(person + " ");
		});

		System.out.println();

		personList.stream().filter(person -> (person.getName().equals("sandeep"))).forEach(System.out::println);

		System.out.println();

		personList.stream().filter(person -> (person.getName().equals("sandeep") || person.getAge() >= 30))
				.forEach(System.out::println);
		System.out.println();

		// Map & reduce
		Integer totalAge1 = personList.stream().map(Person::getAge).reduce((total, age) -> (total + age)).get();
		Integer totalAge2 = personList.stream().map(Person::getAge).reduce((a1, a2) -> (a1 + a2)).get();

		System.out.println("totalAge1 : " + totalAge1);
		System.out.println("totalAge2 : " + totalAge2);

	}

}
