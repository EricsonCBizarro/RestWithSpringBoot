package br.com.erudio.PersonSpringBootApi.services;

import br.com.erudio.PersonSpringBootApi.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

// TODO  @Service serve para que o spring cuide da injeção de dependencia
@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    public Person create(Person person) {
        return person;
    }

    public Person update(Person person) {
        return person;
    }

    public void delete(String id) {

    }

    public Person findById(String id) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Ericson");
        person.setLastName("Bizarro");
        person.setAdress("Passo Fundo - Rio Grande do Sul - Brasil");
        person.setGender("Male");
        return person;
    }

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;

    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name" + i);
        person.setLastName("Last Name" + i);
        person.setAdress("Some adress in Brasil" + i);
        person.setGender("Male");
        return person;
    }
}
