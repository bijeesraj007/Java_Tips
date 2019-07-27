package com.braj.examples.ruleengine;

import java.util.ArrayList;
import java.util.List;


/**
 * Used in Main2_BetterApproch.java
 */
public class RuleEngine {

    List<Rule> ruleArrayList = new ArrayList<>();

    public RuleEngine() {
        // If you want to add all the rules by default.
        //ruleArrayList = Arrays.asList(new AndroidRule(),new IPhoneRule());
    }


    public Phone apply(Phone phone){
        return ruleArrayList.
                stream().
                filter(rule->rule.matches(phone)).
                map(rule ->(Phone) rule.applyRule(phone)).
                findFirst().get();
    }

    public RuleEngine registerRule(Rule<Phone,Phone> rule){
        ruleArrayList.add(rule);
        return this;
    }
}
