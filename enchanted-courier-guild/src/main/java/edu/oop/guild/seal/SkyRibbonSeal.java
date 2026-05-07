//Fady Francis
//AI: Claude
//Strategy: My strategy for designing something like this using AI, is using several tests and making sure that the code is built around the
//the tests, AI has a very hard time forgetting what to do or how to do something if the implementation is built around something else. 
//this strategy is going to be basically the same for all code written by me.
//Prompt: Now following the same strategy as slated several times before, implement both SkyribbonSeal.java and GlowStoneSeal.java.
//Double checking that each of the files fall in compliance with one another and that they both pass all the packageseal tests
//that have been provided to us.

package edu.oop.guild.seal;

import java.util.Objects;

public class SkyRibbonSeal implements PackageSeal {

    @Override
    public String apply(String label) {
        Objects.requireNonNull(label, "label must not be null");
        return "☁ " + label + " ☁";
    }

    @Override
    public int durability() {
        return 7;
    }
}