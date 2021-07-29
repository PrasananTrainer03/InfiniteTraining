package com.java.rest.hello;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employ")
public class EmployService {

	@GET
	@Path("/empsearch/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employ employeeListById(@PathParam("id") int id) throws ClassNotFoundException, SQLException {
	  Employ empl = new EmployDAO().searchEmploy(id);
		  return empl;
	}
	
	@POST
	  @Path("/employInsert/")
	  @Consumes(MediaType.APPLICATION_JSON)
	  @Produces(MediaType.APPLICATION_JSON)
	  public String insertEmploy(Employ e) throws ClassNotFoundException, SQLException {
	    String s = new EmployDAO().addEmploy(e);
	    System.out.println(s);
	    return s;
	  }
	  @GET
	  @Path("/empshow/")
	  @Produces(MediaType.APPLICATION_JSON)
	  public Employ[] employeesList() throws ClassNotFoundException, SQLException {
//	    System.out.println("Employees List");
	    Employ[] employees = new EmployDAO().showEmploy();
	    return employees;
	  }
	  
	  

}
