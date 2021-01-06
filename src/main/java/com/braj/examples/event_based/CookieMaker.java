package com.braj.examples.event_based;

import java.util.ArrayList;
import java.util.List;

public class CookieMaker {
    private List<Person> person = new ArrayList<>();

    public CookieMaker(List<Person> ppl) {
        for(Person eachPerson : ppl) {
            eachPerson.addHungerListener(() -> {
                System.err.println("I am making Cookies for  : " + eachPerson.getFirstName() +"!!");
            });
        }
    }

}
