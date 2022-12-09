//**************************
package deepCopy;

class Student implements Cloneable {
	int id;
	String name;
	Course course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		student.course = (Course) course.clone();
		return student;
	}
}

class Course implements Cloneable {
	String subjectOne, subjectTwo, subjectThree;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String subjectOne, String subjectTwo, String subjectThree) {
		super();
		this.subjectOne = subjectOne;
		this.subjectTwo = subjectTwo;
		this.subjectThree = subjectThree;
	}

	public String getSubjectOne() {
		return subjectOne;
	}

	public void setSubjectOne(String subjectOne) {
		this.subjectOne = subjectOne;
	}

	public String getSubjectTwo() {
		return subjectTwo;
	}

	public void setSubjectTwo(String subjectTwo) {
		this.subjectTwo = subjectTwo;
	}

	public String getSubjectThree() {
		return subjectThree;
	}

	public void setSubjectThree(String subjectThree) {
		this.subjectThree = subjectThree;
	}

	@Override
	public String toString() {
		return "Course [subjectOne=" + subjectOne + ", subjectTwo=" + subjectTwo + ", subjectThree=" + subjectThree
				+ "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

public class DeepCopyCloneExample1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Course course1 = new Course("maths", "science", "english");
		Student student1 = new Student(101, "akshay", course1);
		Student student2 = null;

		System.out.println("initially");
		System.out.println("student 1 : " + student1);
		System.out.println("student 2 : " + student2);
		System.out.println();

		student2 = (Student) student1.clone();

		System.out.println("after 'student2 = (Student) student1.clone()'");
		System.out.println("student 1 : " + student1);
		System.out.println("student 2 : " + student2);
		System.out.println();

		student1.setName("rudra"); // this will not affect the copy/original because we are making change in String
									// type data member of cloneable object. String is also reference type but as we
									// know that Strings in java are immutable so a whole new String is created and
									// its completely new reference is returned which is different from the previous
									// reference. Hence it acts like primitives only. so it is same in case of
									// shallow as well as deep copy.

		System.out.println("after 'student1.setName(\"rudra\")'");
		System.out.println("student 1 : " + student1);
		System.out.println("student 2 : " + student2);
		System.out.println();

		student2.setName("abhilash"); // this will not affect the copy/original because we are making change in String
										// type data member of cloneable object. String is also reference type but as we
										// know that Strings in java are immutable so a whole new String is created and
										// its completely new reference is returned which is different from the previous
										// reference. Hence it acts like primitives only. so it is same in case of
										// shallow as well as deep copy.

		System.out.println("after 'student2.setName(\"abhilash\")'");
		System.out.println("student 1 : " + student1);
		System.out.println("student 2 : " + student2);
		System.out.println();

		student2.setId(501); // this will not affect the copy/original because we are making change in
								// Primitive type data member of cloneable object. so in primitives here the
								// values are actual values not references as in case of reference types. so
								// actual values are changed here which doesn't affects the copy/original. so it
								// is same in case of shallow as well as deep copy.

		System.out.println("after 'student2.setId(501)'");
		System.out.println("student 1 : " + student1);
		System.out.println("student 2 : " + student2);
		System.out.println();

		student2.course.setSubjectOne("xyz"); // here we can see the benefit of deep copy, in this the changes will not
												// be reflected in others original/copy because here we the memory
												// references they are pointing to are different.

		System.out.println("after 'student2.course.setSubjectOne(\"xyz\")'");
		System.out.println("student 1 : " + student1);
		System.out.println("student 2 : " + student2);
		System.out.println();

	}

}
