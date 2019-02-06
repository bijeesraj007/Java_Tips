package com.braj.examples.optional;

public class Person {

    private String firstName;
    private String secondName;
    private String ssn;

    public Person(String firstName, String secondName,  String ssn) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.ssn = ssn;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }


    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
