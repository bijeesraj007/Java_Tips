package com.braj.examples.rule_engine;

public interface Rule <I,O> {

    boolean matches(I input); // Added to avoid "if check of phone type" (see that in Main_TraditionalWay1.java) so that it can be used in functional way.
    O applyRule(I input); // apply rule/logic on the i/p obj and produce o/p obj
}
