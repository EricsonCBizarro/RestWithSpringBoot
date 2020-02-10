package br.com.erudio.PersonSpringBootApi.services;

import br.com.erudio.PersonSpringBootApi.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

// TODO  @Service serve para que o spring cuide da injeção de dependencia
@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    public Person findById(String id){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Ericson");
        person.setLastName("Bizarro");
        person.setAdress("Passo Fundo - Rio Grande do Sul - Brasil");
        person.setGender("Male");
        return person;
    }
}
