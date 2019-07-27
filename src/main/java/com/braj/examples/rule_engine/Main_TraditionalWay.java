package com.braj.examples.rule_engine;


/**
 * IN traditional approch we check the model of the phone in a if
 * and then call the appropriate implementation.
 */
public class Main_TraditionalWay {


    public static void main(String[] args) {
        Phone input = new Phone(OSType.ANDROID);

        //Traditional Approch
        // Check Main2_BetterApproch for builder + functional way of doing it. Can avoid if else.
        if(input.getOsType()==OSType.IOS){
            Phone output= new IPhoneRule().applyRule(input);
            System.out.println(output.toString());
        }else if(input.getOsType()==OSType.ANDROID){
            Phone output= new AndroidRule().applyRule(input);
            System.out.println(output.toString());
        }

    }
}
