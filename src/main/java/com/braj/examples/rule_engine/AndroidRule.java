package com.braj.examples.rule_engine;

public class AndroidRule implements Rule<Phone,Phone> {

    @Override
    public boolean matches(Phone input) {
        return input.getOsType()==OSType.ANDROID;
    }

    @Override
    public Phone applyRule(Phone input) {
        input.setModel("JellyBean OS");
        input.setOsType(OSType.ANDROID); // Not really needed , as the object already has the value
        return input;
    }
}
