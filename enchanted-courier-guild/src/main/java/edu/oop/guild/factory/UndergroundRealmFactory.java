//Fady Francis
//AI: Claude
//Strategy: My strategy for designing something like this using AI, is using several tests and making sure that the code is built around the
//the tests, AI has a very hard time forgetting what to do or how to do something if the implementation is built around something else. 
//this strategy is going to be basically the same for all code written by me.
//Prompt: Now implement SkyRealmFactory and UndergroundRealmFactory.

package edu.oop.guild.factory;

import edu.oop.guild.creature.Creature;
import edu.oop.guild.creature.TunnelMole;
import edu.oop.guild.seal.GlowStoneSeal;
import edu.oop.guild.seal.PackageSeal;

public class UndergroundRealmFactory implements RealmFactory {

    @Override
    public Creature createCourier() {
        return new TunnelMole();
    }

    @Override
    public PackageSeal createSeal() {
        return new GlowStoneSeal();
    }
}
