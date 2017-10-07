package edu.university.assignment1.assignment1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Test2 {

	@Test
	public void test() {

		DateTimeFormatter date = DateTimeFormat.forPattern("MM/dd/yyyy");
		Student testStudent = new Student("Luke Hayes", 22, date.parseDateTime("05/19/1996"));
		assertEquals("Luke Hayes22", testStudent.getUsername());
	}

}