package com.braj.examples.optional;

import java.util.List;
import java.util.Optional;


public class BusinessService {

    private List<Person> people = null;

    public BusinessService(List<Person> people) {
        this.people = people;
    }

    public Optional<Person> getPersonBySSN(String ssn){
         return people.stream().filter(p->p.getSsn().equalsIgnoreCase(ssn)).findFirst();
    }
}
