//Fady Francis
//AI: Claude
//Strategy: My strategy for designing something like this using AI, is using several tests and making sure that the code is built around the
//the tests, AI has a very hard time forgetting what to do or how to do something if the implementation is built around something else. 
//this strategy is going to be basically the same for all code written by me.
//Prompt: Based upon the three java files provided to you in the model folder. Specifically, DelieveryPlanTest.java, DeliveryRequestTest.java, 
//and EnumLabelTest.java, generate an implementation of model that is focused on passing all the provided tests. The implemenation, is not
//limited to three files but can be as many as you deem to be most effiecent and safe.

package edu.oop.guild.model;

public enum PackageType {
    FOOD("Snack crate"),
    POTION("Potion case"),
    ARTIFACT("Ancient artifact");

    private final String label;

    PackageType(String label) {
        this.label = label;
    }

    public String label() {
        return label;
    }
}