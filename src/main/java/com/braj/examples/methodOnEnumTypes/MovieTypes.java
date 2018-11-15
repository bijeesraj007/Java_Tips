package com.braj.examples.methodOnEnumTypes;


// Abstract Classes can be used in Enums. (Good Design)
public enum MovieTypes {

    COMEDY{
        public int calculatePrice() {
            return 12;
        }
    },

    ADVENTURE{
        public int calculatePrice() {
            return 20;
        }
    };

    abstract public int calculatePrice();

}
