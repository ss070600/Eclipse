package misc;

class Student {
	String name, course;
	int age;
	private static String schoolName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 18)
			this.age = age;
		else
			System.out.println("You can't get enrolled");
	}

	static {
		schoolName = "ABC";
	}
}

public class sheet1 {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.setName("sandeep");
		obj.setAge(19);
		obj.setCourse("science");
		System.out.println(obj.getName());
		System.out.println(obj.getCourse());
		System.out.println(obj.getAge());

	}

}
