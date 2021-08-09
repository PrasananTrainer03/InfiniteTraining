package org.me.rest;

public class Dummy {

	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.setEmpno(662);
		employ.setName("Raj");
		employ.setDept("Java");
		employ.setDesig("expert");
		employ.setBasic(88422);
		System.out.println(new EmployCrud().insertEmploy(employ));
	}
}
