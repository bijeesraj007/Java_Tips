package com.braj.examples.ruleengine;

public class Phone {

    private String model;
    private OSType osType;

    public Phone(OSType osType) {
        this.osType = osType;
    }

    public Phone() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public OSType getOsType() {
        return osType;
    }

    public void setOsType(OSType osType) {
        this.osType = osType;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", osType=" + osType +
                '}';
    }
}
