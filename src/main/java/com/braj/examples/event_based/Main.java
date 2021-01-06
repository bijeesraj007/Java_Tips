package com.braj.examples.event_based;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Person> ppl = new ArrayList<>();

        Person p = new Person();
        p.setFirstName("Bijees");
        p.setLastName("Raj");
        ppl.add(p);

        Person p2 = new Person();
        p2.setFirstName("John");
        p2.setLastName("J");
        ppl.add(p2);
        new CoffeeMaker(ppl);
        new CookieMaker(ppl);
        Thread.sleep(4000);
        p.becomesHungry();
        p2.becomesHungry();
        System.out.println("done");
    }
}
