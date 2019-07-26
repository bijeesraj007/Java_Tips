package com.braj.examples.ruleengine;

public class IPhoneRule implements Rule<Phone,Phone> {

    @Override
    public boolean matches(Phone input) {
        return input.getOsType()==OSType.IOS;
    }

    @Override
    public Phone applyRule(Phone input) {
        input.setModel("iPhone 10X");
        return input;
    }
}
