package br.com.erudio.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Person;


@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public List<Person> findAll() {
		
		logger.info("Finding all people!");
		List<Person> persons = new ArrayList<>();
		for(int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
		
	}
	
	public Person findById(String id) {
	
		
		logger.info("Finding one person!");
		
		Person person = new Person();
		
		person.setId(counter.incrementAndGet());
		person.setFirtName("Christian");
		person.setLastName("Carvalho");
		person.setAddress("Criciúma - Santa Catarina - Brasil");
		person.setGender("male");
		return person;
	}
	
	private Person mockPerson(int i) {
		
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirtName("Person name " + i);
		person.setLastName("Last name "+ i);
		person.setAddress("Some address in BRasil" + i);
		person.setGender("male");
		return person;
		
	}
}
