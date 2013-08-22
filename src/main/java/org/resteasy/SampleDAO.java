package org.resteasy;

import java.util.ArrayList;
import java.util.List;

import org.resteasy.model.Person;

public class SampleDAO {
	
	public List<Person> getAllPersons(){
		List<Person> list = new ArrayList<Person>();
		String[] names = {"Jon","Smith"};
		int age = 25;
		for(String name:names){
			Person person = new Person();
			person.setName(name);
			person.setAge(age);
			age++;
			list.add(person);
		}
		return list;
	}

}
