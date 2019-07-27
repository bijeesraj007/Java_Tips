package com.braj.examples.rule_engine;

public class Main2_BetterApproch {

    public static void main(String[] args) {

        /**
         * A Rule engine with builder pattern.
         * So that each rule can be registered.
         */
        RuleEngine ruleEngine = new RuleEngine()
                                .registerRule(new IPhoneRule())
                                .registerRule(new AndroidRule());

        /**
         * aPhone object was applied with Rule.
         * aPhone object data changed after the rule Applied.
         */
        Phone aPhone = new Phone(OSType.ANDROID);
        System.out.println("Input:" + aPhone.toString());
        ruleEngine.apply(aPhone);
        System.out.println("Output :" + aPhone.toString());


    }
}
