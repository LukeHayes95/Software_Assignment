package edu.university.assignment1.assignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Student {

	private String name;
	private int age;
	private DateTime DOB;
	public static int id = 0;
	private String username;

	public Student(String name, int age, DateTime dateTime) {
		this.name = name;
		this.age = age;
		this.DOB = dateTime;
		Student.id = id++;
		this.setUsername(getUsername());

	}

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();

	}

	public String getUsername() {
		return name + "" + age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public DateTime getDOB() {
		return DOB;
	}

	public void setDOB(DateTime dOB) {
		DOB = dOB;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStudentInformation() {
		return "The students name is " + name + "aged" + age + DOB + id + username;

	}
}
