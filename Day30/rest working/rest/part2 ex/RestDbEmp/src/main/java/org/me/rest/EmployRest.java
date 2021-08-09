package org.me.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

@Path("/employ")
public class EmployRest {

	@POST
  @Path("/employInsert/")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public String insertEmploy(final Employ e) {
    String s = new EmployCrud().insertEmploy(e);
    System.out.println(s);
    return s;
  }

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employ employeeListById(@PathParam("id") int id) {
	  Employ empl = new EmployCrud().searchEmploy(id);
	  if (empl == null) {
		throw new NotFoundException("No such Employee ID: " + id);
	  }
	  return empl;
	}
	
	  @GET
	  @Produces(MediaType.APPLICATION_JSON)
	  public Employ[] employeesList() {
//	    System.out.println("Employees List");
	    Employ[] employees = new EmployCrud().showEmploy();
	    return employees;
	  }

}
