package misc;

import java.util.ArrayList;
import java.util.List;

class Person {
	String name;

	public String getName() {
		return name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}

class Client {
	public List<Person> users = new ArrayList<Person>();

	public List<Person> getUsers() {
		return users;
	}

	public void setUsers(List<Person> users) {
		this.users = users;
	}
}

public class sheet3 {

	public static void main(String[] args) {
		List<Person> users = new ArrayList<Person>();
		users.add(new Person("sandeep"));
		users.add(new Person("sande"));
		users.add(new Person("sand"));
		users.add(new Person("san"));
		users.add(new Person("sa"));

		Client obj = new Client();
		obj.setUsers(users);
		for (Person p : obj.getUsers()) {
			System.out.println(p);
		}

	}

}
