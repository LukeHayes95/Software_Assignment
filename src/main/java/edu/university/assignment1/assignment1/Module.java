package edu.university.assignment1.assignment1;

import java.util.ArrayList;

public class Module {

	private String ModuleName;
	public static int ModuleID = 6000;
	private ArrayList<Student> ModuleStudents;

	public Module(String ModuleName, ArrayList<Student> studentsInModules2) {
		this.ModuleName = ModuleName;
		this.ModuleStudents = studentsInModules2;
		Module.ModuleID = ModuleID++;
	}

	public void getStudentsinModule() {
		System.out.println("The Module name is" + ModuleName);
		for (Student temp : ModuleStudents) {
			System.out.println(temp.getName());

		}

	}

	public String getModuleName() {
		return ModuleName;
	}

	public void setName(String name) {
		this.ModuleName = name;
	}
}
