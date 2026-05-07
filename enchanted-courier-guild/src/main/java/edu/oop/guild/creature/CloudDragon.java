//Fady Francis
//AI: Claude
//Strategy: My strategy for designing something like this using AI, is using several tests and making sure that the code is built around the
//the tests, AI has a very hard time forgetting what to do or how to do something if the implementation is built around something else. 
//this strategy is going to be basically the same for all code written by me.
//Prompt: Based off the entirety of the provided zip file, implement creature.java, TunnelMole.java, and CloudDragon.java. The implementation
//focus should be on passing the provided tests in creature test.java along with making sure that these three files are implemented
//without creating too much coupling.

package edu.oop.guild.creature;

import edu.oop.guild.model.RealmType;

public class CloudDragon extends Creature {

    @Override
    public String name() {
        return "Nimbus the Cloud Dragon";
    }

    @Override
    public int carryingCapacityKg() {
        return 80;
    }

    @Override
    public RealmType nativeRealm() {
        return RealmType.SKY;
    }
}