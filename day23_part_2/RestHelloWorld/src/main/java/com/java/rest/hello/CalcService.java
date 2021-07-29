package com.java.rest.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public class CalcService {

	  @GET 
	  @Path("/Sum/{i}/{j}")
	  @Produces(MediaType.TEXT_PLAIN)  
	  public String sum(@PathParam("i") int i,@PathParam("j") int j) {
		  int c=i+j;
		  String res="";
		  res+=c;
		  return res;
	  } 
	  
	  @GET  
	  @Path("/Sub/{i}/{j}")
	  @Produces(MediaType.TEXT_PLAIN)  
	  public String sub(@PathParam("i") int i,@PathParam("j") int j) {
		  int c=i-j;
		  String res="";
		  res+=c;
		  return res;
	  } 
	  
	  @GET  
	  @Path("/Mult/{i}/{j}")
	  @Produces(MediaType.TEXT_PLAIN)  
	  public String mult(@PathParam("i") int i,@PathParam("j") int j) {
		  int c=i*j;
		  String res="";
		  res+=c;
		  return res;
	  } 
}
