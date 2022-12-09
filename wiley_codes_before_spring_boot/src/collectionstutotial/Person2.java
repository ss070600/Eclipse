package collectionstutotial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person2 {
	int id;
	String name;

	public Person2() {
		super();
	}

	public Person2(int id, String name) {
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

	public static Comparator<Person2> idComparator = new Comparator<Person2>() {
		@Override
		public int compare(Person2 p1, Person2 p2) {
			return p1.getId() - p2.getId();
		}
	};

	public static Comparator<Person2> nameComparator = new Comparator<Person2>() {
		@Override
		public int compare(Person2 p1, Person2 p2) {
			return p1.getName().compareTo(p2.getName());
		}
	};

	public static Comparator<Person2> idNameComparator = new Comparator<Person2>() {
		@Override
		public int compare(Person2 p1, Person2 p2) {
			if (p1.getId() == p2.getId())
				return p1.getName().compareTo(p2.getName());
			else
				return p1.getId() - p2.getId();
		}
	};

	public static void main(String[] args) {
		List<Person2> persons = new ArrayList<Person2>();
		Person2 p1 = new Person2(1011, "sandeep");
		Person2 p2 = new Person2(102, "rudra");
		Person2 p3 = new Person2(102, "abhay");
		Person2 p4 = new Person2(1304, "adhiraj");
		Person2 p5 = new Person2(105, "ajay");

		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);

		System.out.println();
		Collections.sort(persons, Person2.idComparator);
		System.out.println(persons);
		System.out.println();
		Collections.sort(persons, Person2.nameComparator);
		System.out.println(persons);
		System.out.println();
		Collections.sort(persons, Person2.idNameComparator);
		System.out.println(persons);
	}
}
