package misc;

import java.util.ArrayList;
import java.util.List;

class UserCollection {
	private List<String> users;

	public List<String> getUsers() {
		return users;
	}

	public void setUsers(List<String> users) {
		this.users = users;
	}
}

public class sheet2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList();
		names.add("sandeep");
		names.add("sande");
		names.add("sand");
		names.add("san");
		names.add("sa");
		UserCollection obj = new UserCollection();
		obj.setUsers(names);
		for (String i : obj.getUsers()) {
			System.out.println(i + " ");
		}

	}

}
