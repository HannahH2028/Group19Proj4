//Fady Francis
//AI: Claude
//Strategy: My strategy for designing something like this using AI, is using several tests and making sure that the code is built around the
//the tests, AI has a very hard time forgetting what to do or how to do something if the implementation is built around something else. 
//this strategy is going to be basically the same for all code written by me.
//Prompt: Generate an interface called PackageSeal that is going to be used to then implement GlowStoneSeal and SkeyRibbonSeal. As always the
//goal is to focus on passing all the test provided by PackageSealTest.java.

package edu.oop.guild.seal;

public interface PackageSeal {
    String apply(String label);
    int durability();
}