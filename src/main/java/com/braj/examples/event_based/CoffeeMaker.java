package com.braj.examples.event_based;

import java.util.ArrayList;
import java.util.List;


//Also have public method to add a person (if thats the use case)
public class CoffeeMaker {

    private List<Person> person = new ArrayList<>();

    public CoffeeMaker(List<Person> ppl) {
        for(Person eachPerson : ppl) {
            eachPerson.addHungerListener(() -> {
                System.err.println("I am making Coffee for  : " + eachPerson.getFirstName() +"!!");
            });
        }
    }

   /* public CoffeeMaker() {
        for(Person eachPerson : this.person) {
            eachPerson.addHungerListener(() -> {
                System.err.println("I am making awesome Coffee for you !!");
            });
        }
    }

    public void addPersonToCoffeeQueue(Person person) {
        this.person.add(person);
    }*/
}
