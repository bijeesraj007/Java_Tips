package com.braj.examples.event_based;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String firstName;
    private String lastName;

    private List<HungerListener> listeners = new ArrayList<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<HungerListener> getListeners() {
        return listeners;
    }

    public void addHungerListener(HungerListener listener) {
        listeners.add(listener);
    }

    public void removeHungerListener(HungerListener listener) {
        listeners.remove(listener);
    }

    /** Beauty is here:
     *  This method will be called when the person is hungry*
     *  This notifies all listeners who are interested in this event. :)
     */
    public void becomesHungry() {
        for (HungerListener listener : listeners)
            listener.hungry();
    }

}
