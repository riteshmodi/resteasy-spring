package org.resteasy.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.resteasy.model.Person;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Produces
@Path("/person")
@Api(value="/person",description="person api")
public class SampleResource {
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="message print",response=Person.class)
	public Person printPerson() {
		Person person1 = new Person();
		person1.setName("Ramesh");
		person1.setAge(26);
		//return context.getBean(Person.class);
		return person1;
	}

}
