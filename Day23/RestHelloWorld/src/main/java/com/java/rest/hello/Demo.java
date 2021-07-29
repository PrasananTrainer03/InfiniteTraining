package com.java.rest.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
public class Demo {

	@Path("/training")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String training() {
		return "Welcome to Java Rest Services...";
	}
	
	@Path("/company")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String company() {
		return "Welcome to Infinite...";
	}
	
	@Path("/trainer")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String trainer() {
		return "Trainer is Prasanna...";
	}
}
