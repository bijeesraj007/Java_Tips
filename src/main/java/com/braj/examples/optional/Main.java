package com.braj.examples.optional;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//1 . Optional is not a replacement for Null.
//2 . Optional can be used when an option may or may not return a value.
//3.  Can be used to write more flowable code.
//4.  Before getting the value from Optional using .get() always check ifPresent before that.
//     Else you will get "java.util.NoSuchElementException" if value is not there
//5.  watch : https://www.youtube.com/watch?v=Ej0sss6cq14
public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Bijees","Raj","55555555"));
        people.add(new Person("Bijees2","Raj2","55555522"));
        people.add(new Person("Bijees3","Raj3","55555523"));

        BusinessService businessService = new BusinessService(people);

        Optional<Person> person  = businessService.getPersonBySSN("999999999");
        System.out.println("Checking for 999999999...");
        if(!person.isPresent()){
            System.out.println("Value not found.");
        }


        System.out.println("Checking for 55555522...");
        person  = businessService.getPersonBySSN("55555522");
        if(person.isPresent()){
            System.out.println("Value found : "+ person.get());
        }

    }
}
