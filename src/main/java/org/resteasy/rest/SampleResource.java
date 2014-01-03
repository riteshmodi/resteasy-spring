package org.resteasy.rest;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.resteasy.SampleDAO;
import org.resteasy.model.Person;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

//@Produces
@Path("/person")
@Api(value="/person",description="person api")
public class SampleResource {
	
	private SampleDAO sampleDAO;
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="message print",response=Person.class)
	public List<Person> printPerson() {
		return sampleDAO.getAllPersons();
	}
	
	public void setSampleDAO(SampleDAO sampleDAO) {
		this.sampleDAO = sampleDAO;
	}

}
