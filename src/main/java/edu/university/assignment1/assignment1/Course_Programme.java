package edu.university.assignment1.assignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course_Programme {

	private String CourseName;
	private ArrayList<Module> ModuleList;
	private DateTime StartDate;
	private DateTime EndDate;

	public Course_Programme(String CourseName, ArrayList<Module> ModuleList, DateTime StartDate, DateTime EndDate) {
		this.CourseName = CourseName;
		this.ModuleList = ModuleList;
		this.setStartDate(StartDate);
		this.setEndDate(EndDate);

	}

	public void getCourse_ProgrammeInformation() {
		System.out.println("The Course name is" + CourseName);
		for (Module temp : ModuleList) {
			System.out.println(temp.getModuleName());
		}

	}

	public DateTime getStartDate() {
		return StartDate;
	}

	public void setStartDate(DateTime startDate) {
		StartDate = startDate;
	}

	public DateTime getEndDate() {
		return EndDate;
	}

	public void setEndDate(DateTime endDate) {
		EndDate = endDate;
	}
}
