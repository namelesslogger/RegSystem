package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Student;

public class StudentTest {
	private Student testStudent = new Student("shane", 20, "12/12/1992", 1431);
	
	@Test
	public void testGetUserName(){
		String expectedResult = "shane20";
		assertEquals(expectedResult, testStudent.getUsername());
	}
}
