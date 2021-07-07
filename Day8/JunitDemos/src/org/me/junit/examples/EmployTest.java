package org.me.junit.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployTest {

	@Test
	public void testConstructor() {
		Employ employ1 = new Employ(1, "Ashish", "Dotnet", "Programmer", 89345);
		assertNotNull(employ1);
		Employ employ2 = new Employ();
		assertNotNull(employ2);
		assertEquals(1, employ1.getEmpno());
		assertEquals("Ashish", employ1.getName());
		assertEquals("Dotnet", employ1.getDept());
		assertEquals("Programmer", employ1.getDesig());
		assertEquals(89345, employ1.getBasic(),0);
	}
	
	@Test 
	public void testToString() {
		Employ employ1 = new Employ(1, "Ashish", "Dotnet", "Programmer", 89345);
		String result = "Employ [empno=" + 1 + ", name=" + "Ashish" + ", "
				+ "dept=" + "Dotnet" + ", desig=" + "Programmer" + ", basic=" + 89345.0  
				+ "]";
		assertEquals(result, employ1.toString());
	}
	@Test
	public void testGettersAndSetters() {
		Employ employ1 = new Employ();
		employ1.setEmpno(1);
		employ1.setName("Karthik");
		employ1.setDept("Java");
		employ1.setDesig("Programmer"); 
		employ1.setBasic(92255);
		
		assertEquals(1, employ1.getEmpno());
		assertEquals("Karthik", employ1.getName());
		assertEquals("Java", employ1.getDept());
		assertEquals("Programmer", employ1.getDesig());
		assertEquals(92255, employ1.getBasic(),0);
	}

}
