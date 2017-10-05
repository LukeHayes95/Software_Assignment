package edu.university.assignment1.assignment1;

import static org.junit.Assert.*;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;



public class StudentTest {

	@Test
	public void setUp() throws Exception
	{
		DateTimeFormatter date = DateTimeFormat.forPattern("MM/dd/yyyy");
		Student testStudent = new Student("Luke Hayes",22,date.parseDateTime("05/19/1996"));
	    assertEquals("Luke Hayes22",testStudent.getUsername());
	}
	
}
